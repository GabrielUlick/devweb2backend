package com.example.backendulicklocadora.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.backendulicklocadora.model.Cliente;
import com.example.backendulicklocadora.repository.ClienteRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Validated
@Service
@Tag(name = "ClienteService", description = "Acesso aos métodos de Cliente")
public class ClienteService extends GenericService<Cliente, ClienteRepository> {
    
    protected ClienteService(ClienteRepository repositoryGenerics) {
        super(repositoryGenerics);
    }
    
}
