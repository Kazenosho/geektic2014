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
	public void test() {
		List<Geek> listGeeks = geekDaoTest.findAll();
		
		assertEquals(listGeeks.size(), 3);
	}

}
