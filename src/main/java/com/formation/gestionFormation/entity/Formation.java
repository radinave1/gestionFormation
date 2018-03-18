package com.formation.gestionFormation.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })  //why this : The problem is that entities are loaded lazy and serialization happens before they get loaded fully.
@Entity
@Table(name = "FORMATION")
public class Formation {

	@Id
	@GeneratedValue
	private Integer id;
	private String nom;
	private Date dateDeFormation;

	@ManyToOne(cascade = CascadeType.ALL)
	private Animateur animateur;

	@ManyToOne(cascade = CascadeType.ALL)
	private CentreFormation centreFormation;

	@ManyToOne(cascade = CascadeType.ALL)
	private Collaborateur responsable;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateDeFormation() {
		return dateDeFormation;
	}

	public void setDateDeFormation(Date dateDeFormation) {
		this.dateDeFormation = dateDeFormation;
	}

	public Animateur getAnimateur() {
		return animateur;
	}

	public void setAnimateur(Animateur animateur) {
		this.animateur = animateur;
	}

	public CentreFormation getCentreFormation() {
		return centreFormation;
	}

	public void setCentreFormation(CentreFormation centreFormation) {
		this.centreFormation = centreFormation;
	}

}
