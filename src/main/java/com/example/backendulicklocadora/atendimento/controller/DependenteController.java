package com.example.backendulicklocadora.atendimento.controller;

import java.util.UUID;

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

    private DependenteService dependenteService;

    public DependenteController(DependenteService dependenteService) {
        super(dependenteService);
    }
    
    @DeleteMapping("/ativo/{id}")
    @GenericOperation(description = "Exclusão lógica de um registro")
    public void exclusaoLogica(@PathVariable UUID id) {
        dependenteService.excluir(id);
    }

}
