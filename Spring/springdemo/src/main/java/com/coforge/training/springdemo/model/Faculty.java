package com.coforge.training.springdemo.model;

public class Faculty {
	
	private int fId;
	private String fName;
	
	private Department department;

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void display() {
		System.out.println(fId+" "+fName+" "+department.getDeptName()+" ");
	}

}
