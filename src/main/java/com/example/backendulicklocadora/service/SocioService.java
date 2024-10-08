package com.example.backendulicklocadora.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.backendulicklocadora.model.Socio;
import com.example.backendulicklocadora.repository.SocioRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Validated
@Service
@Tag(name = "SocioService", description = "Acesso aos métodos de Socio")
public class SocioService extends GenericService<Socio, SocioRepository> {
    
    protected SocioService(SocioRepository repositoryGenerics) {
        super(repositoryGenerics);
    }
    
}
