package com.example.backendulicklocadora.atendimento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.backendulicklocadora.atendimento.model.Cliente;
import com.example.backendulicklocadora.atendimento.model.Locacao;
import com.example.backendulicklocadora.atendimento.repository.ClienteRepository;
import com.example.backendulicklocadora.atendimento.repository.LocacaoRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;
import java.util.UUID;

@Validated
@Service
@Tag(name = "ClienteService", description = "Acesso aos métodos de Cliente")
public class ClienteService extends GenericService<Cliente, ClienteRepository> {

    @Autowired
    private LocacaoRepository locacaoRepository;

    protected ClienteService(ClienteRepository repositoryGenerics) {
        super(repositoryGenerics);
    }

    public boolean verificarPendencias(UUID clienteId) {
        List<Locacao> locacoes = locacaoRepository.findByClienteId(clienteId);
        for (Locacao locacao : locacoes) {
            if (locacao.getDtDevolucaoEfetiva() == null) {
                return true;
            }
        }
        return false;
    }
}