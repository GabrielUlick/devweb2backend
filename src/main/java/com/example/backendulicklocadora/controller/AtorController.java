package com.example.backendulicklocadora.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.model.Ator;
import com.example.backendulicklocadora.service.AtorService;

@Validated
@RestController
@RequestMapping("ator")
public class AtorController extends GenericController<Ator> {

    public AtorController(AtorService atorService) {
        super(atorService);
    }
    
}
