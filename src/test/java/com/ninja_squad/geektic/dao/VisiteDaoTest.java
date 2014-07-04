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

import com.ninja_squad.geektic.entites.Visite;
import com.ninja_squad.geektic.service.GeekService;


public class VisiteDaoTest {

	private VisiteDao mockVisiteDao;
	private GeekService service;

	@Before
	public void setUp() throws Exception {
		mockVisiteDao = mock(VisiteDao.class);
		service = new GeekService(mockVisiteDao);
	}

	@Test
	public void test() {
		
	}

}
