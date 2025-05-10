package br.com.wayon.agendatransferencia.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Transferencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "conta_origem", nullable = false, length = 20)
    private String contaOrigem;

    @Column(name = "conta_destino", nullable = false, length = 20)
    private String contaDestino;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal valor;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal taxa;

    @Column(name = "data_transferencia", nullable = false)
    private LocalDate dataTransferencia;

    @Column(name = "data_agendamento", nullable = false)
    private LocalDate dataAgendamento;
}
