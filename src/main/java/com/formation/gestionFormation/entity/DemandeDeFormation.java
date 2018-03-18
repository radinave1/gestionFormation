package com.formation.gestionFormation.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DEMANDEDEFORMATION")
public class DemandeDeFormation {

	@Id @GeneratedValue
	private Integer id;
	private String nom;
	private String status;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Collaborateur stagaire ;

	

	public Collaborateur getStagaire() {
		return stagaire;
	}
	public void setStagaire(Collaborateur stagaire) {
		this.stagaire = stagaire;
	}
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
