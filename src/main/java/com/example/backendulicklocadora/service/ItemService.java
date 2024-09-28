package com.example.backendulicklocadora.service;

import org.springframework.stereotype.Service;

import com.example.backendulicklocadora.model.Item;
import com.example.backendulicklocadora.repository.ItemRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Service
@Tag(name = "ItemService", description = "Acesso aos métodos de Item")
public class ItemService extends GenericService<Item, ItemRepository> {

    protected ItemService(ItemRepository repositoryGenerics) {
        super(repositoryGenerics);
    }
    
}