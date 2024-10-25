package com.example.backendulicklocadora.controleacervo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.controleacervo.model.Item;
import com.example.backendulicklocadora.controleacervo.service.ItemService;

@Validated
@RestController
@RequestMapping("item")
public class ItemController extends GenericController<Item> {

    public ItemController(ItemService itemService) {
        super(itemService);
    }

}
