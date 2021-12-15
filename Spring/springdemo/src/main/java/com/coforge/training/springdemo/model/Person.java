package com.coforge.training.springdemo.model;

import java.util.Map;
import java.util.Map.Entry;

//Constructor DI with Map
public class Person {
	
	private int id;
    private String name;
    private Map<String, String> phoneNos;
    
	public Person(int id, String name, Map<String, String> phoneNos) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNos = phoneNos;
	}
    
	public void showPhoneNos(){
	    for ( Entry<String, String> entry : phoneNos.entrySet()) {
	        System.out.println(entry.getKey()+"-->"+entry.getValue());
	    }
	    
		}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}