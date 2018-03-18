package com.formation.gestionFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.gestionFormation.dao.FormationDAO;
import com.formation.gestionFormation.entity.Formation;

@Service
public class FormationServiceImpl implements FormationService {
	
	@Autowired
	private FormationDAO formationDAO;

	@Override
	public void ajouterFormation(Formation f) {
		formationDAO.save(f);		
	}

	@Override
	public List<Formation> listDeFormation() {
		// TODO Auto-generated method stub
		
		return formationDAO.findAll();
	}

	@Override
	public Formation getFormation(int id) {
				
	return formationDAO.getOne(id);
		
		
	}

}
