package com.example.backendulicklocadora.atendimento.service;

import java.util.List;
import java.util.UUID;

import jakarta.validation.constraints.Positive;

public interface GenericServiceTypes<Tipo> {

    List<Tipo> listar();

    Tipo buscarPorId(UUID id);

    Tipo criar(Tipo entity);

    Tipo atualizar(@Positive UUID id, Tipo entity);

    void excluir(UUID id);
    
}