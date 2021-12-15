package com.coforge.training.springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Setter Injection with the help of Annotation
@Component		//Spring automatically detects Bean file
public class People {
	
	String name;
	int age;
	
	
	public People() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display()
    {
        System.out.println("*********** Person Details **************");
        System.out.println(name+ " is "+age+ " old.");
    }

}
