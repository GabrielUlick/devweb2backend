package com.example.backendulicklocadora.atendimento.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Socio extends Cliente {

    @Column(length = 11, unique = true, nullable = false)
    private String cpf;

    private String endereco;

    private String telefone;

}
