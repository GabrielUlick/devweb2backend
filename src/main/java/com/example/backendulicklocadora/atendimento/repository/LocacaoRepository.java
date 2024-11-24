package com.example.backendulicklocadora.atendimento.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backendulicklocadora.atendimento.model.Locacao;

@Repository
public interface LocacaoRepository extends JpaRepository<Locacao, UUID> {
    List<Locacao> findByClienteId(UUID clienteId);
    List<Locacao> findByItemId(UUID itemId);
}