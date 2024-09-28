package com.example.backendulicklocadora.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.model.Classe;
import com.example.backendulicklocadora.service.ClasseService;

@Validated
@RestController
@RequestMapping("classe")
public class ClasseController extends GenericController<Classe> {

    public ClasseController(ClasseService classeService) {
        super(classeService);
    }
    
}
