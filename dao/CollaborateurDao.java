package com.example.helpdesk.dao;


import com.example.helpdesk.entity.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaborateurDao extends JpaRepository<Collaborateur, Long> {

    public Collaborateur findByFullname(String fullname);
    public Collaborateur findByLogin(String login);

    public Collaborateur findByLoginAndPassword(String login, String password);

    public Collaborateur findByCodeCollaborateur(String codeCollaborateur);

    public int deleteByCodeCollaborateur(String codeCollaborateur);

}
