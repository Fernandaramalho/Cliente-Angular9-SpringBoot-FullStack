package io.github.fernandaramalho.clientes.model.repository;

import io.github.fernandaramalho.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}


