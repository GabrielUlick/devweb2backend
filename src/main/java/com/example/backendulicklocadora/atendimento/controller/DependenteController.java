package com.example.backendulicklocadora.atendimento.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.atendimento.model.Dependente;
import com.example.backendulicklocadora.atendimento.service.DependenteService;
import com.example.backendulicklocadora.exception.GenericOperation;

@Validated
@RestController
@RequestMapping("dependente")
public class DependenteController extends GenericController<Dependente> {

    private final DependenteService dependenteService;

    @Autowired
    public DependenteController(DependenteService dependenteService) {
        super(dependenteService);
        this.dependenteService = dependenteService;
    }
    
    @DeleteMapping("/ativo/{id}")
    @GenericOperation(description = "Exclusão lógica de um registro")
    public void exclusaoLogica(@PathVariable UUID id) {
        System.out.println("id dele" + id);
        dependenteService.exclusaoLogica(id);
    }
}
