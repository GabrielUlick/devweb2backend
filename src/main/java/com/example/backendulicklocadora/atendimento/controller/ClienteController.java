package com.example.backendulicklocadora.atendimento.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.atendimento.service.ClienteService;

@Validated
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{clienteId}/pendencias")
    public boolean verificarPendencias(@PathVariable UUID clienteId) {
        return clienteService.verificarPendencias(clienteId);
    }
}