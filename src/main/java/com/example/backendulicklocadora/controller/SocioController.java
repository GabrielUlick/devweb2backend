package com.example.backendulicklocadora.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.model.Socio;
import com.example.backendulicklocadora.service.SocioService;

@Validated
@RestController
@RequestMapping("socio")
public class SocioController extends GenericController<Socio> {

    public SocioController(SocioService socioService) {
        super(socioService);
    }

}
