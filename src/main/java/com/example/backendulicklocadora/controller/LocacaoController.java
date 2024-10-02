package com.example.backendulicklocadora.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.model.Locacao;
import com.example.backendulicklocadora.service.LocacaoService;

@Validated
@RestController
@RequestMapping("locacao")
public class LocacaoController extends GenericController<Locacao> {

    public LocacaoController(LocacaoService locacaoService) {
        super(locacaoService);
    }
    
}
