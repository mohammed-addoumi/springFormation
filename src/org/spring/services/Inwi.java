package org.spring.services;

import org.spring.models.User;

public class Inwi implements Sim {
	
	private String name;
	private int id;
	private User user;
	
	
	
	public Inwi() {
		// TODO Auto-generated constructor stub
	}

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


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public void calling() {
		System.out.println("calling with Iwni Operator");

	}

	@Override
	public void data() {
		System.out.println("data with Iwni Operator");

	}

}
