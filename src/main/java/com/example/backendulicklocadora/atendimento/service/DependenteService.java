package com.example.backendulicklocadora.atendimento.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.backendulicklocadora.atendimento.model.Dependente;
import com.example.backendulicklocadora.atendimento.repository.DependenteRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Validated
@Service
@Tag(name = "DependenteService", description = "Acesso aos métodos de Dependente")
public class DependenteService extends GenericService<Dependente, DependenteRepository> {
    
    protected DependenteService(DependenteRepository repositoryGenerics) {
        super(repositoryGenerics);
    }
    
    public Void exclusaoLogica(UUID id) {
        Dependente dependente = this.repositoryGenerics.findById(id).get();
        dependente.SwitchAtivo();
        this.repositoryGenerics.save(dependente);
        return null;
    }

}
