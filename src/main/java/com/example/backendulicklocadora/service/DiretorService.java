package com.example.backendulicklocadora.service;

import org.springframework.stereotype.Service;

import com.example.backendulicklocadora.model.Diretor;
import com.example.backendulicklocadora.repository.DiretorRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Service
@Tag(name = "DiretorService", description = "Acesso aos métodos de Diretor")
public class DiretorService extends GenericService<Diretor, DiretorRepository>{
    
    protected DiretorService(DiretorRepository repositoryGenerics) {
        super(repositoryGenerics);
    }

}