package br.com.wayon.agendatransferencia.controller;

import br.com.wayon.agendatransferencia.dto.request.TransferenciaRequestDTO;
import br.com.wayon.agendatransferencia.dto.response.TransferenciaResponseDTO;
import br.com.wayon.agendatransferencia.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/${app.version}/agenda-transferencia")
public class AgendaTransferenciaController {

    private final TransferenciaService transferenciaService;

    public AgendaTransferenciaController(TransferenciaService transferenciaService) {
        this.transferenciaService = transferenciaService;
    }

    @PostMapping("/transferencias")
    public ResponseEntity<TransferenciaResponseDTO> agendar(@RequestBody TransferenciaRequestDTO dto) {
        return ResponseEntity.ok(transferenciaService.agendarTransferencia(dto));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<TransferenciaResponseDTO>> listar() {
        List<TransferenciaResponseDTO> transferencias = transferenciaService.listarTodas();
        return ResponseEntity.ok(transferencias);
    }
}
