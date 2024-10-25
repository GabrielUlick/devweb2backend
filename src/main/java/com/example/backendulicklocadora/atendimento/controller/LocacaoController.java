package com.example.backendulicklocadora.atendimento.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.atendimento.model.Locacao;
import com.example.backendulicklocadora.atendimento.service.LocacaoService;

@Validated
@RestController
@RequestMapping("locacao")
public class LocacaoController extends GenericController<Locacao> {

    public LocacaoController(LocacaoService locacaoService) {
        super(locacaoService);
    }
    
}
