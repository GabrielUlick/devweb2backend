package com.example.backendulicklocadora.controleacervo.service;

import org.springframework.stereotype.Service;

import com.example.backendulicklocadora.controleacervo.model.Titulo;
import com.example.backendulicklocadora.controleacervo.repository.TituloRepository;

import io.swagger.v3.oas.annotations.tags.Tag;


@Service
@Tag(name = "TituloService", description = "Acesso aos métodos de Titulo")
public class TituloService extends GenericService<Titulo, TituloRepository> {
    
    protected TituloService(TituloRepository repositoryGenerics) {
        super(repositoryGenerics);
    }
}