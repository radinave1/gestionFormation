package com.formation.gestionFormation.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.gestionFormation.dao.CollaborateurDAO;
import com.formation.gestionFormation.entity.Collaborateur;

@Service
public class CollaborateurServiceImplementation implements CollaborateurService {
	
	@Autowired
	private CollaborateurDAO collaborateurDAO;

	@Transactional
	@Override
	public void ajouterCollaborateur(Collaborateur c) {
		// TODO Auto-generated method stub
		collaborateurDAO.save(c);
		
	}



}
