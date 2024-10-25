package com.example.backendulicklocadora.controleacervo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.controleacervo.model.Diretor;
import com.example.backendulicklocadora.controleacervo.service.DiretorService;

@Validated
@RestController
@RequestMapping("diretor")
public class DiretorController extends GenericController<Diretor> {

    public DiretorController(DiretorService diretorService) {
        super(diretorService);
    }

}
