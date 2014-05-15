package com.esprit.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity


public class Etudiant implements Serializable {

	@Id
	private String num_insc;
	private String cin;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private String sexe;
	private String dat_nai;
	@ManyToOne
	private Classe classe;
	public String getNum_insc() {
		return num_insc;
	}
	public void setNum_insc(String num_insc) {
		this.num_insc = num_insc;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cin == null) ? 0 : cin.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant other = (Etudiant) obj;
		if (cin == null) {
			if (other.cin != null)
				return false;
		} else if (!cin.equals(other.cin))
			return false;
		return true;
	}
	public Etudiant() {
		super();
	}
	@Override
	public String toString() {
		return nom;
	}
	public String getDat_nai() {
		return dat_nai;
	}
	public void setDat_nai(String dat_nai) {
		this.dat_nai = dat_nai;
	}

	
	
	
}
