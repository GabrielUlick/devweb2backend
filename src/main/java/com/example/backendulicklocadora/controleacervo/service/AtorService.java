package com.example.backendulicklocadora.controleacervo.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.backendulicklocadora.controleacervo.model.Ator;
import com.example.backendulicklocadora.controleacervo.repository.AtorRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Validated
@Service
@Tag(name = "AtorService", description = "Acesso aos métodos de Ator")
public class AtorService extends GenericService<Ator, AtorRepository> {
    
    protected AtorService(AtorRepository repositoryGenerics) {
        super(repositoryGenerics);
    }

}