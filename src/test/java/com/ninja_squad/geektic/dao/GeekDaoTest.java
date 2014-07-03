package com.ninja_squad.geektic.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ninja_squad.geektic.dao.GeekDao;
import com.ninja_squad.geektic.entites.Geek;

public class GeekDaoTest extends BaseDaoTest{
	@Autowired
	private GeekDao geekDaoTest;


	@Test
	public void testRecupTousLesGeeks() {
		List<Geek> listGeeks = geekDaoTest.findAllGeeks('M');
		assertEquals(listGeeks.size(), 2);
	}
	
	@Test
	public void testRecupToutesLesGeekettes() {
		List<Geek> listGeeks = geekDaoTest.findAllGeeks('F');
		assertEquals(listGeeks.size(), 1);
	}
	
	@Test
	public void testRecupGeekById() {
		Geek geek = geekDaoTest.findGeekById(1L);
		assertEquals(geek.getNom(), "Affou");
	}

}
