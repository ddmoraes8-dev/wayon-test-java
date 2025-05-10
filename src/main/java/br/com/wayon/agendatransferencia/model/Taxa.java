package br.com.wayon.agendatransferencia.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Taxa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dias_de", nullable = false)
    private Integer diasDe;

    @Column(name = "dias_ate", nullable = false)
    private Integer diasAte;

    @Column(name = "taxa_fixa", nullable = false, precision = 15, scale = 2)
    private BigDecimal taxaFixa;

    @Column(name = "taxa_percentual", nullable = false, precision = 5, scale = 2)
    private BigDecimal taxaPercentual;
}
