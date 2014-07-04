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
		String jpql = "SELECT COUNT (visite.IdGeek) FROM Visite where IdGeek =:idGeek";
		Query query = em.createQuery(jpql);
		query.setParameter("idGeek", idGeek);
		return (int) query.getSingleResult();
	}
	
	public void addVisite(Visite v){
		em.persist(v);
	}
}
