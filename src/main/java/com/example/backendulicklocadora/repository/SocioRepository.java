package com.example.backendulicklocadora.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backendulicklocadora.model.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, UUID> {

}
