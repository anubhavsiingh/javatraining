package com.coforge.training.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.model.Candidate;

@RestController
public class CandidateRestController {
	private static Map<String, List<Candidate>> collegeDB; //= new HashMap<String, List<Candidate>>();
	
	static {
	collegeDB = new HashMap<String, List<Candidate>>();
	List<Candidate> lst = new ArrayList<Candidate>();
	Candidate std = new Candidate("Mike", "Electronics");
	lst.add(std);
	std = new Candidate("Mary", "Computer Science");
	lst.add(std);
	collegeDB.put("IP", lst);
	lst = new ArrayList<Candidate>();
	std = new Candidate("James", "Mech");
	lst.add(std);
	std = new Candidate("Sukesh", "Electrical");
	lst.add(std);
	collegeDB.put("RVCE", lst);
	}
	
	@RequestMapping(value = "/getStudentDetailsForCollege/{collegename}", method = RequestMethod.GET)
	public List<Candidate> getStudents(@PathVariable String collegename) {
	System.out.println("Getting Student details for " + collegename);
	List<Candidate> studentList = collegeDB.get(collegename);
	
	if (studentList == null) {
	studentList = new ArrayList<Candidate>();
	Candidate std = new Candidate("Not Found", "N/A");
	studentList.add(std);
	}
	return studentList;
	}
	
}
