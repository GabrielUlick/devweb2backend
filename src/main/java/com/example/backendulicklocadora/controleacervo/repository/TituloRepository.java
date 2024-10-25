package com.example.backendulicklocadora.controleacervo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backendulicklocadora.controleacervo.model.Titulo;

@Repository
public interface TituloRepository extends JpaRepository<Titulo, UUID> {

}
