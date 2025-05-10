package br.com.wayon.agendatransferencia.dto.response;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class TransferenciaResponseDTO {
    private Long id;
    private String contaOrigem;
    private String contaDestino;
    private BigDecimal valor;
    private BigDecimal taxa;
    private LocalDate dataTransferencia;
    private LocalDate dataAgendamento;
}
