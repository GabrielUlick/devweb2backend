package com.example.backendulicklocadora.atendimento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.atendimento.model.Dependente;
import com.example.backendulicklocadora.atendimento.service.DependenteService;
import com.example.backendulicklocadora.atendimento.service.dto.DependenteDTO;

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

    @GetMapping("/comSocios")
    public List<DependenteDTO> listarDependentesComSocios() {
        return dependenteService.listarDependentesComSocios();
    }

}
