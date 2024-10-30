package com.example.backendulicklocadora.atendimento.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.atendimento.model.Socio;
import com.example.backendulicklocadora.atendimento.service.SocioService;
import com.example.backendulicklocadora.exception.GenericOperation;

@Validated
@RestController
@RequestMapping("socio")
public class SocioController extends GenericController<Socio> {

    private final SocioService socioService;

    @Autowired
    public SocioController(SocioService socioService) {
        super(socioService);
        this.socioService = socioService;
    }

    @DeleteMapping("/ativo/{id}")
    @GenericOperation(description = "Exclusão lógica de um registro")
    public void exclusaoLogica(@PathVariable UUID id) {
        socioService.exclusaoLogica(id);
    }

}
