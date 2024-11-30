package com.example.backendulicklocadora.controleacervo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.controleacervo.model.Titulo;
import com.example.backendulicklocadora.controleacervo.service.TituloService;

import java.util.List;
import java.util.UUID;

@Validated
@RestController
@RequestMapping("titulo")
public class TituloController extends GenericController<Titulo> {

    private final TituloService tituloService;

    public TituloController(TituloService tituloService) {
        super(tituloService);
        this.tituloService = tituloService;
    }

    @GetMapping("/consultarPorNome/{nome}")
    public List<Titulo> consultarPorNome(@PathVariable String nome) {
        System.out.println("Nome: " + nome);
        return tituloService.consultarPorNome(nome);
    }

    @GetMapping("/consultarPorCategoria/{categoria}")
    public List<Titulo> consultarPorCategoria(@PathVariable String categoria) {
        System.out.println(" Categoria: " + categoria);
        return tituloService.consultarPorCategoria(categoria);
    }

    @GetMapping("/consultarPorAtor/{uuid}")
    public List<Titulo> consultarPorAtor(@PathVariable String uuid) {
        UUID uuidObj = UUID.fromString(uuid);
        System.out.println("UUID: " + uuidObj );
        return tituloService.consultarPorAtor(uuidObj);
    }
}