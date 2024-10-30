package com.example.backendulicklocadora.atendimento.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.backendulicklocadora.atendimento.model.Socio;
import com.example.backendulicklocadora.atendimento.repository.SocioRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Validated
@Service
@Tag(name = "SocioService", description = "Acesso aos métodos de Socio")
public class SocioService extends GenericService<Socio, SocioRepository> {
    
    protected SocioService(SocioRepository repositoryGenerics) {
        super(repositoryGenerics);
    }
    
    public Void exclusaoLogica(UUID id) {
        Socio socio = this.repositoryGenerics.findById(id).get();
        socio.SwitchAtivo();
        this.repositoryGenerics.save(socio);
        return null;
    }

}
