package com.example.backendulicklocadora.atendimento.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backendulicklocadora.atendimento.model.Dependente;



@Repository
public interface DependenteRepository extends JpaRepository<Dependente, UUID> {

    List<Dependente> findBySocioId(UUID id);

}
