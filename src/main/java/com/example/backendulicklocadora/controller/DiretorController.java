package com.example.backendulicklocadora.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.model.Diretor;
import com.example.backendulicklocadora.service.DiretorService;

@Validated
@RestController
@RequestMapping("diretor")
public class DiretorController extends GenericController<Diretor> {

    public DiretorController(DiretorService diretorService) {
        super(diretorService);
    }

}
