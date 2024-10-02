package com.example.backendulicklocadora.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.model.Dependente;
import com.example.backendulicklocadora.service.DependenteService;

@Validated
@RestController
@RequestMapping("dependente")
public class DependenteController extends GenericController<Dependente> {

    public DependenteController(DependenteService dependenteService) {
        super(dependenteService);
    }
    
}
