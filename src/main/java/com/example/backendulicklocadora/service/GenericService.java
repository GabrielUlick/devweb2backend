package com.example.backendulicklocadora.service;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendulicklocadora.exception.RegistroNotFoundException;
import com.example.backendulicklocadora.exception.RegistroNotUpdated;

public abstract class GenericService<TipoEntidade, RepositorioGenerics extends JpaRepository<TipoEntidade, UUID>>
        implements GenericServiceTypes<TipoEntidade> {
            
    protected RepositorioGenerics repositoryGenerics;

    protected GenericService(RepositorioGenerics repositoryGenerics) {
        this.repositoryGenerics = repositoryGenerics;
    }

    @Override
    public List<TipoEntidade> listar() {
        return repositoryGenerics.findAll();
    }

    @Override
    public TipoEntidade buscarPorId(UUID id) {
        return repositoryGenerics.findById(id).orElseThrow(() -> new RegistroNotFoundException(id));
    }

    @Override
    public TipoEntidade criar(TipoEntidade entity) {
        return repositoryGenerics.save(entity);
    }

    @Override
    public void excluir(UUID id) {
        repositoryGenerics
                .delete(this.repositoryGenerics.findById(id).orElseThrow(() -> new RegistroNotFoundException(id)));
    }

    @Override
    public TipoEntidade atualizar(UUID id, TipoEntidade entityAtualizada) {
        TipoEntidade entity = repositoryGenerics.findById(id).orElseThrow(() -> new RegistroNotUpdated(id));
        entity = entityAtualizada;
        return repositoryGenerics.save(entity);
    }
}
