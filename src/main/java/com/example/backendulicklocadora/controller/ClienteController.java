package com.example.backendulicklocadora.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.model.Cliente;
import com.example.backendulicklocadora.service.ClienteService;

@Validated
@RestController
@RequestMapping("cliente")
public class ClienteController extends GenericController<Cliente> {

    public ClienteController(ClienteService clienteService) {
        super(clienteService);
    }
    
}
