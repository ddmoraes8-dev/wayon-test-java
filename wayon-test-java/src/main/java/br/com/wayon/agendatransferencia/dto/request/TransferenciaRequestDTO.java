package br.com.wayon.agendatransferencia.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class TransferenciaRequestDTO {

    private String contaOrigem;
    private String contaDestino;
    private BigDecimal valor;
    private LocalDate dataTransferencia;

}
