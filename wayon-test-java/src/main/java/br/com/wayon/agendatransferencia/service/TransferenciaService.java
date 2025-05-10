package br.com.wayon.agendatransferencia.service;

import br.com.wayon.agendatransferencia.dto.request.TransferenciaRequestDTO;
import br.com.wayon.agendatransferencia.dto.response.TransferenciaResponseDTO;
import br.com.wayon.agendatransferencia.model.Taxa;
import br.com.wayon.agendatransferencia.model.Transferencia;
import br.com.wayon.agendatransferencia.repository.TaxaRepository;
import br.com.wayon.agendatransferencia.repository.TransferenciaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class TransferenciaService {

    private final TransferenciaRepository transferenciaRepository;
    private final TaxaRepository taxaRepository;
    private final ModelMapper modelMapper;

    public TransferenciaService(TransferenciaRepository transferenciaRepository, TaxaRepository taxaRepository, ModelMapper modelMapper) {
        this.transferenciaRepository = transferenciaRepository;
        this.taxaRepository = taxaRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    public TransferenciaResponseDTO agendarTransferencia(TransferenciaRequestDTO requestDTO) {
        Transferencia transferencia = modelMapper.map(requestDTO, Transferencia.class);

        long dias = ChronoUnit.DAYS.between(LocalDate.now(), transferencia.getDataTransferencia());

        Taxa taxa = taxaRepository
                .findByDiasDeLessThanEqualAndDiasAteGreaterThanEqual((int) dias, (int) dias)
                .orElseThrow(() -> new IllegalArgumentException("Nenhuma taxa aplicável encontrada para " + dias + " dias."));

        BigDecimal valorTaxa = taxa.getTaxaFixa()
                .add(transferencia.getValor()
                        .multiply(taxa.getTaxaPercentual().divide(BigDecimal.valueOf(100))));

        transferencia.setTaxa(valorTaxa);
        transferencia.setDataAgendamento(LocalDate.now());

        Transferencia salva = transferenciaRepository.save(transferencia);

        return modelMapper.map(salva, TransferenciaResponseDTO.class);
    }

    public List<TransferenciaResponseDTO> listarTodas() {
        return transferenciaRepository.findAll().stream()
                .map(t -> modelMapper.map(t, TransferenciaResponseDTO.class))
                .toList();
    }
}
