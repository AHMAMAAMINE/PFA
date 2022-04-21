package com.example.helpdesk.dao;

import com.example.helpdesk.entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mehdi
 */
@Repository
public interface EquipeDao extends JpaRepository<Equipe, Long> {

    public Equipe findByLibelle(String libelle);

    public Equipe findByChefEquipeCollaborateurCodeCollaborateur(String Code);

    public Equipe findByCode(String code);

    public Equipe findByRef(String ref);

    public int deleteByRef(String ref);

}
