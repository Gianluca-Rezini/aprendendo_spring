package com.gianluca.aprendendo_spring.infrastructure.repository;

import com.gianluca.aprendendo_spring.infrastructure.endity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
