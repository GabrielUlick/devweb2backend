package com.example.backendulicklocadora.controleacervo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.backendulicklocadora.controleacervo.model.Item;
import com.example.backendulicklocadora.controleacervo.model.Titulo;
import com.example.backendulicklocadora.controleacervo.repository.ItemRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Service
@Tag(name = "ItemService", description = "Acesso aos métodos de Item")
public class ItemService extends GenericService<Item, ItemRepository> {

    protected ItemService(ItemRepository repositoryGenerics) {
        super(repositoryGenerics);
    }

    public List<Item> consultarPorNome(String nome) {
        return repositoryGenerics.findByTituloNomeContainingIgnoreCase(nome);
    }

    public List<Item> consultarPorCategoria(String categoria) {
        return repositoryGenerics.findByTituloCategoriaContainingIgnoreCase(categoria);
    }

    public List<Item> consultarPorAtor(UUID ator) {
        return repositoryGenerics.findByTituloAtorId(ator);
    }
}