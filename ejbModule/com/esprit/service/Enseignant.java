package com.esprit.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class Enseignant
 */
@Stateless

public class Enseignant  {

	@PersistenceContext(unitName ="class")
	EntityManager entityManager;
	
	public void addenseignant(Enseignant enseignant) {
		entityManager.persist(enseignant);
		
	}

}
