package br.com.wayon.agendatransferencia.controller;

import br.com.wayon.agendatransferencia.dto.request.TransferenciaRequestDTO;
import br.com.wayon.agendatransferencia.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/${app.version}/agenda-transferencia")
public class AgendaTransferenciaController{

    private final TransferenciaService transferenciaService;

    public AgendaTransferenciaController(TransferenciaService transferenciaService) {
        this.transferenciaService = transferenciaService;
    }

    @PostMapping("/transferencias")
    public ResponseEntity<String> criarTransferencia(@RequestBody TransferenciaRequestDTO transferenciaRequestDTO) {
        return ResponseEntity.ok("Transferencia criada com sucesso!");
    }
}
