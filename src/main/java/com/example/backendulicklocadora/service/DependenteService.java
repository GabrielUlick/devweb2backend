package com.example.backendulicklocadora.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.backendulicklocadora.model.Dependente;
import com.example.backendulicklocadora.repository.DependenteRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Validated
@Service
@Tag(name = "DependenteService", description = "Acesso aos métodos de Dependente")
public class DependenteService extends GenericService<Dependente, DependenteRepository> {
    
    protected DependenteService(DependenteRepository repositoryGenerics) {
        super(repositoryGenerics);
    }
    
}
