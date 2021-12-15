package com.coforge.training.springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Country {
	
	private String name;
	@Autowired
	private Capital capital;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Capital getCapital() {
		return capital;
	}
	public void setCapital(Capital capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + "]";
	}
	
	

}
