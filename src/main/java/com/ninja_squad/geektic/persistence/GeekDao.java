package com.ninja_squad.geektic.persistence;

import javax.persistence.EntityManager;

public class GeekDao {
	private EntityManager em;
	public GeekDao(EntityManager em) {
		this.em = em;
	}
}
