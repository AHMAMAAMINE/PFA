/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.helpdesk.service;

import java.util.List;


import com.example.helpdesk.dao.MembreEquipeDao;
import com.example.helpdesk.entity.MembreEquipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mehdi
 */
@Service
public class MembreEquipeService {

    @Autowired
    private MembreEquipeDao membreEquipeDao;
    @Autowired
    private CollaborateurService collaborateurService;

    public MembreEquipe findByCollaborateurFullname(String fullname) {
        return membreEquipeDao.findByCollaborateurFullname(fullname);
    }

    public List<MembreEquipe> findByEquipeRef(String ref) {
        return membreEquipeDao.findByEquipeRef(ref);
    }

    public MembreEquipe findByCollaborateurCodeCollaborateur(String code) {
        return membreEquipeDao.findByCollaborateurCodeCollaborateur(code);
    }

    @Transactional
    public int deleteByCollaborateurFullname(String fullname) {
        return membreEquipeDao.deleteByCollaborateurFullname(fullname);
    }

    public List<MembreEquipe> findAll() {
        return membreEquipeDao.findAll();
    }

    public int save(MembreEquipe membres) {

        if (membres.getCollaborateur() != null && membres.getCollaborateur().getCodeCollaborateur() != null) {
            membres.setCollaborateur(
                    collaborateurService.findByCodeCollaborateur(membres.getCollaborateur().getCodeCollaborateur()));
            membreEquipeDao.save(membres);
            return 0;
        } else {
            return -2;
        }
    }

}
