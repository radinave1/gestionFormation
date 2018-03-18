package com.formation.gestionFormation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ANIMATEUR")
public class Animateur {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "NOM")
	private String nom;
	@Column(name = "AGE")
	private int age;
	@Column(name = "ENTREPRISE")
	private String entreprise;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String intreprise) {
		this.entreprise = intreprise;
	}

}
