package com.example.backendulicklocadora.controleacervo.model;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Titulo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 100)
    private String nome;

    private Date ano;

    @Column(length = 100)
    private String sinopse;

    @Column(length = 100)
    private String categoria;

    @ManyToOne
    @JoinColumn(name = "ator_id", referencedColumnName = "id")
    private Ator ator;

    @ManyToOne
    @JoinColumn(name = "diretor_id", referencedColumnName = "id")
    private Diretor diretor;

    @ManyToOne
    @JoinColumn(name = "classe_id", referencedColumnName = "id")
    private Classe classe;
}
