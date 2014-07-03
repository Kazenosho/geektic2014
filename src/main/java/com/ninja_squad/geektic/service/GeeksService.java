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
import com.ninja_squad.geektic.entites.Geek;

@RestController
@Transactional
@RequestMapping("/afficheGeeks")
public class GeeksService {
	@Autowired
	private GeekDao geekDao;
	
	@RequestMapping(method = GET,value = "/{sexe}")
	public List<Geek> afficheGeeks(@PathVariable char sexe){
		List<Geek> listeGeeks = geekDao.findAllGeeks(sexe);
		return listeGeeks;
	}
	
}
