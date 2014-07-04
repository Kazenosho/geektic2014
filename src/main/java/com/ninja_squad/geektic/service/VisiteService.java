package com.ninja_squad.geektic.service;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.dao.GeekDao;
import com.ninja_squad.geektic.dao.InteretDao;
import com.ninja_squad.geektic.dao.VisiteDao;
import com.ninja_squad.geektic.entites.Geek;
import com.ninja_squad.geektic.entites.Interet;

@RestController
@Transactional
@RequestMapping("/visites")
public class VisiteService {
	@Autowired
	private VisiteDao visiteDao;
	
	@RequestMapping(method = GET,value = "/{id}")
	public int recupInterets(@PathVariable int id){
		int nbVisites = visiteDao.findNbVisite(id);
		return nbVisites;
	}
	
}