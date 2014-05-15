package com.esprit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.domain.Presence;
import com.esprit.domain.Seance;

/**
 * Session Bean implementation class SeanceService
 */
@Stateless

public class SeanceService  {

	@PersistenceContext(unitName ="class")
	EntityManager entityManager;

	
	public void addseance(Seance seance) {
		entityManager.persist(seance);
		
	}

	
	public List<Seance> getAllSeance() {
		Query query =  entityManager.createQuery("select c from Seance c");
	    return query.getResultList();
	}

	
	public Seance getSeanceByDate(int id) {
		
		return entityManager.find(Seance.class, id);
	}

	
	public List<Presence> getListPres(int id) {
		return entityManager.createQuery("SELECT p from Presence p WHERE p.seance.id=:p1")
				.setParameter("p1", id)
				.getResultList();
	}


}
