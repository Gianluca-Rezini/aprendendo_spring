package com.gianluca.aprendendo_spring.infrastructure.repository;

import com.gianluca.aprendendo_spring.infrastructure.endity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
