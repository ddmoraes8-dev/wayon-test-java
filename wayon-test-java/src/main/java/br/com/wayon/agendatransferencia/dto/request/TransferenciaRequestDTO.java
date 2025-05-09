package br.com.wayon.agendatransferencia.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TransferenciaRequestDTO {

    private Integer contaOrigem;
    private Integer contaDestino;
    private LocalDateTime dataAgendamento;

}
