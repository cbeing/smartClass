package com.esprit.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.domain.Classe;

/**
 * Session Bean implementation class ClasseService
 */
@Stateless

public class ClasseService {

	@PersistenceContext(unitName ="class")
	EntityManager entityManager;

	

	
	public void addclasse(Classe classe) {
		
	entityManager.persist(classe);
	
	}

}
