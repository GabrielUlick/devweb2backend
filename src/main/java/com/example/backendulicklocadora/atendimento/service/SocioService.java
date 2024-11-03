package com.example.backendulicklocadora.atendimento.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.backendulicklocadora.atendimento.model.Dependente;
import com.example.backendulicklocadora.atendimento.model.Socio;
import com.example.backendulicklocadora.atendimento.repository.DependenteRepository;
import com.example.backendulicklocadora.atendimento.repository.SocioRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

@Validated
@Service
@Tag(name = "SocioService", description = "Acesso aos métodos de Socio")
public class SocioService extends GenericService<Socio, SocioRepository> {
    
    private final DependenteRepository dependenteRepository;

    protected SocioService(SocioRepository repositoryGenerics, DependenteRepository dependenteRepository) {
        super(repositoryGenerics);
        this.dependenteRepository = dependenteRepository;
    }
    
    public Void exclusaoLogica(UUID id) {
        Socio socio = this.repositoryGenerics.findById(id).get();
        socio.SwitchAtivo();
        this.repositoryGenerics.save(socio);

        List<Dependente> dependentes = dependenteRepository.findBySocioId(id);
        for (Dependente dependente : dependentes) {
            dependente.SwitchAtivo();
            dependenteRepository.save(dependente);
        }

        return null;
    }

    public Void exclusaoSociosEDependentes(UUID id) {
        Socio socio = this.repositoryGenerics.findById(id).get();

        List<Dependente> dependentes = dependenteRepository.findBySocioId(id);
        for (Dependente dependente : dependentes) {
            dependenteRepository.delete(dependente);
        }
        this.repositoryGenerics.delete(socio);

        return null;
    }

    // public List<Socio> listarSociosComMenosDe3Dependentes()  {
    //     return this.repositoryGenerics.findByDependentesCountLessThan(3);
    // }

}
