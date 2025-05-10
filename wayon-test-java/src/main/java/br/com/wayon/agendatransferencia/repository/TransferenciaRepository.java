package br.com.wayon.agendatransferencia.repository;

import br.com.wayon.agendatransferencia.model.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
}
