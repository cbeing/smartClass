package com.esprit.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Enseignant implements Serializable{
   @Id
	private String matricule;
	private String cin;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private String sexe;
	private String dat_nai;
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
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
	public String getDat_nai() {
		return dat_nai;
	}
	public void setDat_nai(String dat_nai) {
		this.dat_nai = dat_nai;
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
		Enseignant other = (Enseignant) obj;
		if (cin == null) {
			if (other.cin != null)
				return false;
		} else if (!cin.equals(other.cin))
			return false;
		return true;
	}
	public Enseignant() {
		super();
	}
	@Override
	public String toString() {
		return "Enseignant [matricule=" + matricule + ", cin=" + cin + ", nom="
				+ nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", email=" + email + ", sexe=" + sexe + ", dat_nai="
				+ dat_nai + "]";
	}
	
    
    
    
}
