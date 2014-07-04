package com.ninja_squad.geektic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.ninja_squad.geektic.entites.Geek;
import com.ninja_squad.geektic.entites.Visite;

@Repository
public class VisiteDao {
	@PersistenceContext
    private EntityManager em;
	
	public int findNbVisite(int idGeek){
		Query query=em.createQuery("SELECT COUNT (*) FROM Visite where idGeek =:idGeek");
		query.setParameter("idGeek", idGeek);
		Long result=(Long) query.getSingleResult();
		int nbVisites = result.intValue();
		return nbVisites;
	}
	
	public void addVisite(Visite v){
		em.persist(v);
	}
}
