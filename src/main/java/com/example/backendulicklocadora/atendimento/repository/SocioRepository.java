package com.example.backendulicklocadora.atendimento.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.backendulicklocadora.atendimento.model.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, UUID> {

    @Query("SELECT s FROM Socio s WHERE (SELECT COUNT(d) FROM Dependente d WHERE d.socio.id = s.id) < 3")
    List<Socio> findBySociosComMenosDe3Dependentes();
    
}
