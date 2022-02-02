package io.github.fernandaramalho.clientes.model.repository;

import io.github.fernandaramalho.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
