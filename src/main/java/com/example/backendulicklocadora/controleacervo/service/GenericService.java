package com.example.backendulicklocadora.controleacervo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendulicklocadora.exception.RegistroNotFoundException;
import com.example.backendulicklocadora.exception.RegistroNotUpdated;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public abstract class GenericService<TipoEntidade, RepositorioGenerics extends JpaRepository<TipoEntidade, UUID>>
    implements GenericServiceTypes<TipoEntidade> {
        
    protected RepositorioGenerics repositoryGenerics;

    protected GenericService(RepositorioGenerics repositoryGenerics) {
    this.repositoryGenerics = repositoryGenerics;
    }

    @Override
    public List<TipoEntidade> listar() {
    try {
        return repositoryGenerics.findAll();
    } catch (Exception e) {
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro ao listar entidades", e);
    }
    }

    @Override
    public TipoEntidade buscarPorId(UUID id) {
    try {
        return repositoryGenerics.findById(id).orElseThrow(() -> new RegistroNotFoundException("Registro não encontrado"));
    } catch (RegistroNotFoundException e) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
    } catch (Exception e) {
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro ao buscar entidade por ID", e);
    }
    }

    @Override
    public TipoEntidade criar(TipoEntidade entity) {
    try {
        return repositoryGenerics.save(entity);
    } catch (Exception e) {
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro ao criar entidade", e);
    }
    }

    @Override
    public void excluir(UUID id) {
    try {
        TipoEntidade entity = repositoryGenerics.findById(id).orElseThrow(() -> new RegistroNotFoundException("Registro não encontrado"));
        repositoryGenerics.delete(entity);
    } catch (RegistroNotFoundException e) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
    } catch (Exception e) {
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro ao excluir entidade", e);
    }
    }

    @Override
    public TipoEntidade atualizar(UUID id, TipoEntidade entityAtualizada) {
    try {
        TipoEntidade entity = repositoryGenerics.findById(id).orElseThrow(() -> new RegistroNotFoundException("Registro não encontrado"));
        entity = entityAtualizada;
        return repositoryGenerics.save(entity);
    } catch (RegistroNotUpdated e) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
    } catch (Exception e) {
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro ao atualizar entidade", e);
    }
    }
}
