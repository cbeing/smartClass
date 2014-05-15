package com.esprit.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PersistenceContext;
import javax.persistence.Transient;
@Entity
public class Seance implements Serializable
{
	@Transient
	@PersistenceContext
	EntityManager entityManager;
	
	
@Id
   private int id;
@OneToOne
   private Matiere matiere;
@OneToOne
   private Classe classe;
/*
@OneToMany(mappedBy="seance",fetch=FetchType.LAZY)
   private List<Presence> listPres;*/
   @OneToOne
   private Enseignant enseignant;
   private String Date_Se;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Matiere getMatiere() {
	return matiere;
}
public void setMatiere(Matiere matiere) {
	this.matiere = matiere;
}
public Classe getClasse() {
	return classe;
}
public void setClasse(Classe classe) {
	this.classe = classe;
}/*
public List<Presence> getListPres() {
	
  /* listPres= entityManager.createQuery("SELECT p from Presence p WHERE p.seance.id=:p1")
			.setParameter("p1", id)
			.getResultList(); 
	
	
	return listPres;
}
public void setListPres(List<Presence> listPres) {
	this.listPres = listPres;
}*/
public Enseignant getEnseignant() {
	return enseignant;
}
public void setEnseignant(Enseignant enseignant) {
	this.enseignant = enseignant;
}
public String getDate_Se() {
	return Date_Se;
}
public void setDate_Se(String date_Se) {
	Date_Se = date_Se;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
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
	Seance other = (Seance) obj;
	if (id != other.id)
		return false;
	return true;
}
@Override
public String toString() {
	return "Seance [id=" + id + ", matiere=" + matiere 
			+ ", enseignant=" + enseignant
			+ ", Date_Se=" + Date_Se + "]";
}
  
  
   
}
