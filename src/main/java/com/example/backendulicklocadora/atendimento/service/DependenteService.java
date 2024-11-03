package com.example.backendulicklocadora.atendimento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backendulicklocadora.atendimento.model.Dependente;
import com.example.backendulicklocadora.atendimento.repository.DependenteRepository;


import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.UUID;

@Service
@Tag(name = "DependenteService", description = "Acesso aos métodos de Dependente")
public class DependenteService extends GenericService<Dependente, DependenteRepository> {

    @Autowired
    // private DependenteMapper dependenteMapper;

    protected DependenteService(DependenteRepository repositoryGenerics) {
        super(repositoryGenerics);
    }

    public Void exclusaoLogica(UUID id) {
        Dependente dependente = this.repositoryGenerics.findById(id).get();
        dependente.SwitchAtivo();
        this.repositoryGenerics.save(dependente);
        return null;
    }

    // public List<DependenteDTO> listarDependentesComSocios() {
    //     CycleAvoidingMappingContext context = new CycleAvoidingMappingContext();
    //     return dependenteMapper.toDTO(this.repositoryGenerics.findAll(), context);
    // }
}
