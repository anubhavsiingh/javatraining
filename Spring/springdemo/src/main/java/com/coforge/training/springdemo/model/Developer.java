package com.coforge.training.springdemo.model;

import java.util.Iterator;
import java.util.List;

public class Developer {
	
	int empId;
    String empName;
    List<String> tech;
    
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getTech() {
		return tech;
	}
	public void setTech(List<String> tech) {
		this.tech = tech;
	}
    
	public void display(){
		System.out.println("**************** Developer Information ****************");
		System.out.println(empId+" "+empName);
		System.out.println("Technolgies :");
		Iterator<String> i=tech.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
			System.out.println("***************************************************");
	}
}	
