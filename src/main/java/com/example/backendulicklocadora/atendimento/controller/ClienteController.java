package com.example.backendulicklocadora.atendimento.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.atendimento.model.Cliente;
import com.example.backendulicklocadora.atendimento.service.ClienteService;

@Validated
@RestController
@RequestMapping("cliente")
public class ClienteController extends GenericController<Cliente> {

    public ClienteController(ClienteService clienteService) {
        super(clienteService);
    }
    
}
