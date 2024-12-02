package com.example.backendulicklocadora.controleacervo.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backendulicklocadora.controleacervo.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, UUID> {
    List<Item> findByTituloNomeContainingIgnoreCase(String nome);
    List<Item> findByTituloCategoriaContainingIgnoreCase(String categoria);
    List<Item> findByTituloAtorId(UUID atorId);
}
