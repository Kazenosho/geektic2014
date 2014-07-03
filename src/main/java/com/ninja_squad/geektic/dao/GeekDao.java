package com.ninja_squad.geektic.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.entites.Geek;

@Repository
public class GeekDao {
	@PersistenceContext
	private EntityManager em;
	
	public List<Geek> findAll(){
		String jpql = "SELECT g FROM Geek as g";
		TypedQuery<Geek> query = em.createQuery(jpql, Geek.class);
		return query.getResultList(); 
	}
}
