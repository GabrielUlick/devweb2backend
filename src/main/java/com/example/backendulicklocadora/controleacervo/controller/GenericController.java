package com.example.backendulicklocadora.controleacervo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendulicklocadora.exception.GenericOperation;
import com.example.backendulicklocadora.controleacervo.service.GenericServiceTypes;

import jakarta.validation.constraints.Positive;

@Validated
@RestController
@RequestMapping("/api")
public abstract class GenericController<TipoEntidade> {

    private final GenericServiceTypes<TipoEntidade> genericService;

    protected GenericController(GenericServiceTypes<TipoEntidade> genericService) {
        this.genericService = genericService;
    }

    @GetMapping
    @GenericOperation(description = "Listar todos os registros")
    public ResponseEntity<List<TipoEntidade>> listar() {
        return ResponseEntity.ok().body(genericService.listar());
    }

    @GetMapping("/{id}")
    @GenericOperation(description = "Buscar um registro por ID")
    public ResponseEntity<TipoEntidade> buscarPorId(@PathVariable UUID id) {
        return ResponseEntity.ok().body(genericService.buscarPorId(id));
    }

    @PostMapping
    @GenericOperation(description = "Criar um registro")
    public ResponseEntity<TipoEntidade> criar(@RequestBody TipoEntidade entity) {
        return ResponseEntity.ok().body(genericService.criar(entity));
    }

    @PutMapping("/{id}")
    @GenericOperation(description = "Atualizar um registro")
    public  ResponseEntity<TipoEntidade> atualizar(@PathVariable @Positive UUID id, @RequestBody TipoEntidade entity) {
        return ResponseEntity.ok().body(genericService.atualizar(id, entity));
    }

    @DeleteMapping("/{id}")
    @GenericOperation(description = "Excluir um registro")
    public void excluir(@PathVariable UUID id) {
        genericService.excluir(id);
    }
}
