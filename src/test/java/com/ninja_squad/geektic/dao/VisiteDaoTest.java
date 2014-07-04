package com.ninja_squad.geektic.dao;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ninja_squad.geektic.entites.Geek;
import com.ninja_squad.geektic.entites.Visite;
import com.ninja_squad.geektic.service.GeekService;


public class VisiteDaoTest extends BaseDaoTest{
	
	@Autowired
	private VisiteDao visiteDaoTest;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int nb = visiteDaoTest.findNbVisite(1);
		assertEquals(nb, 3);
	}

}
