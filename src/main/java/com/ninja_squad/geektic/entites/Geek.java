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
sequenceName="geek_seq")
public class Geek {
			
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id")
	@Column(name="ID")
	private Long id;	
	
	@Column
	private String nom;
	
	@Column
	private String prenom;
	
	@Column
	private String mail;
	
	@Column
	private String gravatar;
	
	@ManyToMany
	@JoinTable(name = "GEEK_INTERET",
	           joinColumns = @JoinColumn(name = "IDGEEK"),
	           inverseJoinColumns = @JoinColumn(name = "IDINTERET"))
	private Set<Interet> interets;
	
	public Geek(){}
	
	public Geek(String nom, String prenom, String mail, String gravatar) {
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.gravatar = gravatar;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getGravatar() {
		return gravatar;
	}

	public void setGravatar(String gravatar) {
		this.gravatar = gravatar;
	}

	public Set<Interet> getInteret() {
		return interets;
	}

	public void setInteret(Set<Interet> interets) {
		interets = interets;
	}

	
	
}
