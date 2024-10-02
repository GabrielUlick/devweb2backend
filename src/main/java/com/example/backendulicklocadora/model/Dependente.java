package com.example.backendulicklocadora.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Dependente extends Cliente {

    @ManyToOne
    @JoinColumn(name = "socio_id", referencedColumnName = "id")
    private Socio socio;
}
