package com.example.backendulicklocadora.controleacervo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.controleacervo.model.Titulo;
import com.example.backendulicklocadora.controleacervo.service.TituloService;


@Validated
@RestController
@RequestMapping("titulo")
public class TituloController extends GenericController<Titulo> {

    public TituloController(TituloService tituloService) {
        super(tituloService);
    }

}