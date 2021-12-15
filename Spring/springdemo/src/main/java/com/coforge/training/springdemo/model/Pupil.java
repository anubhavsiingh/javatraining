package com.coforge.training.springdemo.model;

//Constructor DI with Arrays
public class Pupil {
	
	 private int id;
	 private String name;
	 private String[] hobbies;
	 
	public Pupil(int id, String name, String[] hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	 
	public void showHobbies() {
        for (int i = 0; i < hobbies.length; i++) {
            System.out.println(hobbies[i]);
        }
	}

}
