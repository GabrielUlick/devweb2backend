package com.example.backendulicklocadora.service;

import org.springframework.stereotype.Service;

import com.example.backendulicklocadora.model.Titulo;
import com.example.backendulicklocadora.repository.TituloRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Service
@Tag(name = "TituloService", description = "Acesso aos métodos de Titulo")
public class TituloService extends GenericService<Titulo, TituloRepository> {
    
    protected TituloService(TituloRepository repositoryGenerics) {
        super(repositoryGenerics);
    }

}