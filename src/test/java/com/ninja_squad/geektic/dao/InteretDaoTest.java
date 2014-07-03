package com.ninja_squad.geektic.dao;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ninja_squad.geektic.dao.InteretDao;
import com.ninja_squad.geektic.entites.Interet;

public class InteretDaoTest extends BaseDaoTest{
        
        @Autowired
        private InteretDao InteretTest;
        @Test
        public void testGetAllInteret() {
                List<Interet> MaListe= InteretTest.getAllInteret();

                assertEquals(MaListe.size(),3);
        }


}
