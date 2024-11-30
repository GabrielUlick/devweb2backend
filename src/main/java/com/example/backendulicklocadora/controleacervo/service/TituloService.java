package com.example.backendulicklocadora.controleacervo.service;

import org.springframework.stereotype.Service;

import com.example.backendulicklocadora.controleacervo.model.Titulo;
import com.example.backendulicklocadora.controleacervo.repository.TituloRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;
import java.util.UUID;

@Service
@Tag(name = "TituloService", description = "Acesso aos métodos de Titulo")
public class TituloService extends GenericService<Titulo, TituloRepository> {
    
    protected TituloService(TituloRepository repositoryGenerics) {
        super(repositoryGenerics);
    }

    public List<Titulo> consultarPorNome(String nome) {
        return repositoryGenerics.findByNomeContainingIgnoreCase(nome);
    }

    public List<Titulo> consultarPorCategoria(String categoria) {
        return repositoryGenerics.findByCategoriaContainingIgnoreCase(categoria);
    }

    public List<Titulo> consultarPorAtor(UUID ator) {
        return repositoryGenerics.findByAtorId(ator);
    }
}