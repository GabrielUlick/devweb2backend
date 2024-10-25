package com.example.backendulicklocadora.atendimento.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backendulicklocadora.atendimento.model.Cliente;



@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID> {

}
