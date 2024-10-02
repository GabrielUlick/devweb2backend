package com.example.backendulicklocadora.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.backendulicklocadora.model.Locacao;
import com.example.backendulicklocadora.repository.LocacaoRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Validated
@Service
@Tag(name = "LocacaoService", description = "Acesso aos métodos de Locacao")
public class LocacaoService extends GenericService<Locacao, LocacaoRepository> {
    
    protected LocacaoService(LocacaoRepository repositoryGenerics) {
        super(repositoryGenerics);
    }
    
}
