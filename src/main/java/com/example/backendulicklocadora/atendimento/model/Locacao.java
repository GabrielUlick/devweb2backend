package com.example.backendulicklocadora.atendimento.model;

import java.util.Date;
import java.util.UUID;

import com.example.backendulicklocadora.controleacervo.model.Item;

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
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Date dtLocacao;

    private Date dtDevolucaoPrevista;

    private Date dtDevolucaoEfetiva;

    private double valorCobrado;

    private double multaCobrada;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private Item item;
}
