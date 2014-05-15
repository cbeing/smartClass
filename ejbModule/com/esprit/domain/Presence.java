package com.esprit.domain;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Presence implements Serializable{
@Id
	 private int id; 
@OneToOne
	 private Etudiant etudiant;
	 private Boolean etat;
	 @ManyToOne
     private Seance seance;
	 private String h_entree;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Etudiant getEtudiant() {
		return etudiant;
	}


	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}


	public Boolean getEtat() {
		return etat;
	}


	public void setEtat(Boolean etat) {
		this.etat = etat;
	}


	public Presence() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Seance getSeance() {
		return seance;
	}


	public void setSeance(Seance seance) {
		this.seance = seance;
	}


	public String getH_entree() {
		return h_entree;
	}


	public void setH_entree(String h_entree) {
		this.h_entree = h_entree;
	}


	@Override
	public String toString() {
		return "Presence [id=" + id + ", etudiant=" + etudiant + ", etat="
				+ etat + ", seance=" + seance + ", h_entree=" + h_entree + "]";
	}
	 
	
	

}
 