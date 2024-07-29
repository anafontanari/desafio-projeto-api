package spring_boot.desafio_projeto.clientregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_boot.desafio_projeto.clientregistration.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
