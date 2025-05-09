package br.com.wayon.agendatransferencia.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Transferencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer contaOrigem;
    private Integer contaDestino;
    private LocalDateTime dataAgendamento;
    private BigDecimal taxa;
    private BigDecimal valorCalculado;
}
