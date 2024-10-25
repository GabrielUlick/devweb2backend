package com.example.backendulicklocadora.controleacervo.service;

import org.springframework.stereotype.Service;

import com.example.backendulicklocadora.controleacervo.model.Classe;
import com.example.backendulicklocadora.controleacervo.repository.ClasseRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Service
@Tag(name = "ClasseService", description = "Acesso aos métodos de Classe")
public class ClasseService extends GenericService<Classe, ClasseRepository> {
    
    protected ClasseService(ClasseRepository repositoryGenerics) {
        super(repositoryGenerics);
    }

}