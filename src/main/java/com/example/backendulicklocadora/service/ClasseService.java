package com.example.backendulicklocadora.service;

import org.springframework.stereotype.Service;

import com.example.backendulicklocadora.model.Classe;
import com.example.backendulicklocadora.repository.ClasseRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Service
@Tag(name = "ClasseService", description = "Acesso aos métodos de Classe")
public class ClasseService extends GenericService<Classe, ClasseRepository> {
    
    protected ClasseService(ClasseRepository repositoryGenerics) {
        super(repositoryGenerics);
    }

}