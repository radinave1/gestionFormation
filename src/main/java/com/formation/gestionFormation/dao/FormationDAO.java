package com.formation.gestionFormation.dao;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.gestionFormation.entity.Formation;

@Repository
public interface FormationDAO extends JpaRepository<Formation, Integer> {

}
