package com.example.backendulicklocadora.controleacervo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.controleacervo.model.Item;
import com.example.backendulicklocadora.controleacervo.model.Titulo;
import com.example.backendulicklocadora.controleacervo.service.ItemService;

@Validated
@RestController
@RequestMapping("item")
public class ItemController extends GenericController<Item> {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        super(itemService);
        this.itemService = itemService;
    }

    @GetMapping("/consultarPorNome/{nome}")
    public List<Item> consultarPorNome(@PathVariable String nome) {
        System.out.println("Nome: " + nome);
        return itemService.consultarPorNome(nome);
    }

    @GetMapping("/consultarPorCategoria/{categoria}")
    public List<Item> consultarPorCategoria(@PathVariable String categoria) {
        System.out.println(" Categoria: " + categoria);
        return itemService.consultarPorCategoria(categoria);
    }

    @GetMapping("/consultarPorAtor/{uuid}")
    public List<Item> consultarPorAtor(@PathVariable String uuid) {
        UUID uuidObj = UUID.fromString(uuid);
        System.out.println("UUID: " + uuidObj);
        return itemService.consultarPorAtor(uuidObj);
    }
}
