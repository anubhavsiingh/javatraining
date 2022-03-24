package com.coforge.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.service.CandidateServiceClient;

@RestController
public class CollegeRestController {

	@Autowired
	private CandidateServiceClient candidateServiceClient;
	
	@RequestMapping(value = "/getCollegeDetails/{collegename}", method = RequestMethod.GET)
	public String getCandidates(@PathVariable String collegename) {
		System.out.println("Going to call Candidate service to get data!");
		return candidateServiceClient.callCandidateServiceAndGetData(collegename);
	}
	
	
}
