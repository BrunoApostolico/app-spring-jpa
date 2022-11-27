package br.edu.infnet.appspringjpa.repository;

import br.edu.infnet.appspringjpa.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
