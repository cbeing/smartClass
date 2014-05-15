package com.esprit.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esprit.domain.Presence;

/**
 * Session Bean implementation class PresenceService
 */
@Stateless

public class PresenceService  {

	@PersistenceContext(unitName ="class")
	EntityManager entityManager;
	
	public void addpresence(Presence presence) {
		entityManager.persist(presence);
		
	}

}
