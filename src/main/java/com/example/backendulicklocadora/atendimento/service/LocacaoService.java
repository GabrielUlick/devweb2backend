package com.example.backendulicklocadora.atendimento.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.backendulicklocadora.atendimento.model.Locacao;
import com.example.backendulicklocadora.atendimento.repository.LocacaoRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Validated
@Service
@Tag(name = "LocacaoService", description = "Acesso aos métodos de Locacao")
public class LocacaoService extends GenericService<Locacao, LocacaoRepository> {
    
    protected LocacaoService(LocacaoRepository repositoryGenerics) {
        super(repositoryGenerics);
    }
    
}
