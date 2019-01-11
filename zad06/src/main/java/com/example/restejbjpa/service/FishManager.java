package com.example.restejbjpa.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.restejbjpa.domain.Fish;

@Singleton
public class FishManager {
	
	@PersistenceContext
	EntityManager em;
	
	
	public void addFish(Fish fish) {
		em.persist(fish);
	}
	
//	public void removeFish(long id) {
//		em.remove(entity);
//	}
	
	public Fish getFish(long id) {
		return em.find(Fish.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Fish> getAllFish(){
		return em.createNamedQuery("fish.all").getResultList();
	}
//	
	public void deleteAll() {
	em.createNamedQuery("fish.delete.all").executeUpdate();
	}

}
