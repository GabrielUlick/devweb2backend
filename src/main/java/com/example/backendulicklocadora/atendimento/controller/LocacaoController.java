package com.example.backendulicklocadora.atendimento.controller;

import java.util.UUID;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.atendimento.model.Locacao;
import com.example.backendulicklocadora.atendimento.service.LocacaoService;

@Validated
@RestController
@RequestMapping("locacao")
public class LocacaoController extends GenericController<Locacao> {

    private final LocacaoService locacaoService;

    public LocacaoController(LocacaoService locacaoService) {
        super(locacaoService);
        this.locacaoService = locacaoService;
    }

    @GetMapping("/verificarItemDisponivel/{itemId}")
    public boolean verificarItemDisponivel(@PathVariable UUID itemId) {
        return locacaoService.verificarItemDisponivel(itemId);
    }
    
}
