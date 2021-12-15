package com.coforge.training.springdemo.model;


//Bean class for DI by using setter method
public class Employee {
	
	private int id;
    private String name,city;
    
    
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
	public void display() {
		System.out.println(id+" "+name+" "+city);
	}

}
