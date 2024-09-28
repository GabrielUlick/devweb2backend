package com.example.backendulicklocadora.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.model.Item;
import com.example.backendulicklocadora.service.ItemService;

@Validated
@RestController
@RequestMapping("item")
public class ItemController extends GenericController<Item> {

    public ItemController(ItemService itemService) {
        super(itemService);
    }

}
