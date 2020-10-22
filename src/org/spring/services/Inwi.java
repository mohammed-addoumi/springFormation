package org.spring.services;

import org.spring.models.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Inwi implements Sim {
	
	@Value("formation spring")
	private String name;
	@Value("10")
	private int id;
	@Autowired(required = false)
	@Qualifier("personne1")
	private Personne personne;
	

	public int getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Personne getPersonne() {
		return personne;
	}


	@Override
	public void calling() {
		System.out.println("calling with Iwni Operator");
		//personne.use();

	}

	@Override
	public void data() {
		System.out.println("data with Iwni Operator");

	}

}
