package com.esprit.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.domain.Matiere;

/**
 * Session Bean implementation class MatiereService
 */
@Stateless

public class MatiereService  {

	@PersistenceContext(unitName ="class")
	EntityManager entityManager;

	
	public void addmatiere(Matiere matiere) {
		entityManager.persist(matiere);
		
	}

}
