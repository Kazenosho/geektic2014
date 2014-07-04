package com.ninja_squad.geektic.entites;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Visite {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="my_entity_seq_gen")
    @SequenceGenerator(name="my_entity_seq_gen", sequenceName="MY_ENTITY_SEQ")
	@Column(name="ID")
	private int id;	
	
	@Column
	private String ip;
	
	@Column
	private Date date;
	
	@Column
	private int idGeek;
	
	public Visite(){}

	public Visite(String ip, Date date) {
		this.ip = ip;
		this.date = date;
	}
	
	public Visite(int idGeek, String ip, Date date) {
		this.idGeek = idGeek;
		this.ip = ip;
		this.date = date;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getIp() {
		return ip;
	}



	public void setIp(String ip) {
		this.ip = ip;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
