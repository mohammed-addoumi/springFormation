package org.spring.models;

public class User implements Personne{

	private int id;
	private String name;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void use() {
		System.out.println("i am a user using the app");
	}
}
