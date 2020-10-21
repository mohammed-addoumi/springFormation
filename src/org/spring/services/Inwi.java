package org.spring.services;

public class Inwi implements Sim {
	
	private String name;
	private int id;
	
	
	
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


	@Override
	public void calling() {
		System.out.println("calling with Iwni Operator");

	}

	@Override
	public void data() {
		System.out.println("data with Iwni Operator");

	}

}
