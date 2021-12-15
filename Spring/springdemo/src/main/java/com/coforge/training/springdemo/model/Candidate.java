package com.coforge.training.springdemo.model;

//Constructor Injection with Dependent object(a) of Address
//Loosely coupled Model
public class Candidate {
	
	private int id;
    private String name;
    
    //Aggregation - has a relationship
    private Address a;

	public Candidate() {
		System.out.println("Candidate details:");
	}

	public Candidate(int id, String name, Address a) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
	}
    
	public void disp()
    {
        System.out.println(id+" "+name);
        System.out.println(a);  // invoke toString() method of Address class
    }
}
