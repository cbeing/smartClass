package com.esprit.service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.domain.Etudiant;
import com.esprit.domain.Presence;
import com.esprit.domain.Seance;

/**
 * Session Bean implementation class EtudiantService
 */
@Stateless

@WebService
public class EtudiantService {

	@PersistenceContext(unitName ="class")
	EntityManager entityManager;


	@WebMethod
	public void addetudiant(Etudiant etudiant) {
		entityManager.persist(etudiant);
		
	}
	
	@WebMethod
	public Etudiant getEtudiantByid(String id) {
		
		return entityManager.find(Etudiant.class, id);
	}
	
	public List<Seance> getSeanceByDatetime(String id) {
		
		return entityManager.createQuery("SELECT s from Seance s WHERE s.Date_Se=:p1")
				.setParameter("p1", id)
				.getResultList();
	}
    
	@WebMethod
	public void updateetudiant(Etudiant etudiant){
		
		entityManager.merge(etudiant);
	}
	
	@WebMethod
	public void updatepresence(Presence presence){

		entityManager.merge(presence);

	}
	@WebMethod
	public void removepresence(Presence presence){

		entityManager.remove(presence);

	}
	@WebMethod
	public void addpresence(Presence presence){

		entityManager.persist(presence);

	}
	
	
	
	@WebMethod
	public List<Etudiant> getAllEtudiants() {
	Query query =  entityManager.createQuery("select c from Etudiant c");
		
		//Query query =  entityManager.createQuery("select c from etudiant c");
	return query.getResultList();
	}
	//////////////////////////////////////////////////////////////////////////////
	///////// Seance Service//////////////////////////////////
	
	
	@WebMethod
	public List<Presence> getListPres(String id) {
		return entityManager.createQuery("SELECT p from Presence p WHERE p.seance.Date_Se=:p1")
				.setParameter("p1", id)
				.getResultList();	
	}

	

	
	
	
	

}
