package com.formation.gestionFormation.service;

import java.util.List;

import com.formation.gestionFormation.entity.Formation;

public interface FormationService {
	
	void ajouterFormation(Formation  f);
	List<Formation> listDeFormation();
	Formation getFormation(int id);
}
