package com.formation.gestionFormation.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.gestionFormation.entity.Collaborateur;

@Repository
public interface CollaborateurDAO extends JpaRepository<Collaborateur, Integer> {

	

}
