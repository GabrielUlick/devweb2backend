package com.example.backendulicklocadora.controleacervo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.controleacervo.model.Ator;
import com.example.backendulicklocadora.controleacervo.service.AtorService;

@Validated
@RestController
@RequestMapping("ator")
public class AtorController extends GenericController<Ator> {

    public AtorController(AtorService atorService) {
        super(atorService);
    }
    
}
