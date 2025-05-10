package br.com.wayon.agendatransferencia.repository;

import br.com.wayon.agendatransferencia.model.Taxa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaxaRepository extends JpaRepository<Taxa, Long> {

    Optional<Taxa> findByDiasDeLessThanEqualAndDiasAteGreaterThanEqual(int diasDe, int diasAte);
}
