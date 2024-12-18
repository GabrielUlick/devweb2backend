package com.example.backendulicklocadora.controleacervo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backendulicklocadora.controleacervo.model.Classe;

@Repository
public interface ClasseRepository extends JpaRepository<Classe, UUID> {

}
