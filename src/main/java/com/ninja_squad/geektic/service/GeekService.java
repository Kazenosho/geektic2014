package com.ninja_squad.geektic.service;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.dao.GeekDao;
import com.ninja_squad.geektic.dao.VisiteDao;
import com.ninja_squad.geektic.entites.Geek;
import com.ninja_squad.geektic.entites.Visite;

@RestController
@Transactional
@RequestMapping("/geek")
public class GeekService {
	@Autowired
	private GeekDao geekDao;
	@Autowired
	private VisiteDao visiteDao;
	
	@RequestMapping(method = GET,value = "/{id}")
	public Geek afficheGeek(@PathVariable int id, HttpServletRequest request){
		Date d = new Date();
		Visite v = new Visite(id,request.getRemoteAddr() ,d);
		visiteDao.addVisite(v);
		
		Geek geek = geekDao.findGeekById(id);
		return geek;
	}
	
	
}
