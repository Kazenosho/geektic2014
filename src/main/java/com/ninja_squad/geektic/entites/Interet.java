package com.ninja_squad.geektic.entites;

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
@SequenceGenerator(name="id",
sequenceName="interet_seq")
public class Interet {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id")
	@Column(name="ID")
	private Long id;	
	
	@Column
	private String nom;
	
	@Column
	private String description;
	
	@ManyToMany(mappedBy="interets")
	private Set<Geek> geeks;
	
	public Interet(){}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Interet(String nom, String description) {
		this.nom = nom;
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
