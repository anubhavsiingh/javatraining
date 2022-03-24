package com.coforge.training.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CandidateServiceClient {

	@Autowired
	private RestTemplate restTemplate;
	
	@Bean
	public RestTemplate restTemplate() {
	return new RestTemplate();
	}
	
	/*Circuit Breaker - Closed State If Client request is sent to the actual service method only,
	 *  then it is called as CLOSED CIRCUIT. Hence, this state represents that
	 the service is running properly and providing the expected functionality.*/
	
	@HystrixCommand(fallbackMethod = "callCandidateServiceAndGetData_Fallback")
	public String callCandidateServiceAndGetData(String collegename) {
		System.out.println("Getting College details for " + collegename);
		String response = restTemplate
				.exchange("http://localhost:8098/getStudentDetailsForCollege/{schoolname}"
						, HttpMethod.GET
						, null
						, new ParameterizedTypeReference<String>() {
						}, collegename).getBody();
		System.out.println("Response Received as " + response + " - " + new Date());
		return "NORMAL FLOW !!! - College Name - " + collegename + " ::: " +
		" Candidate Details " + response + " - " + new Date();
	}
	
	/*Circuit Breaker - Open State -- Service is Not Running
	If Client request is redirected to Fallback method, then such case is an OPEN CIRCUIT. Hence,
	 this state represents that service is unavailable or faulty and error rate is beyond the threshold.*/
	
	@SuppressWarnings("unused")
	private String callCandidateServiceAndGetData_Fallback(String collegename) {

	System.out.println("Candidate Service is down!!! fallback route enabled...");

	return "CIRCUIT BREAKER ENABLED!!! No Response From Candidate Service at this moment. " +
	" Service will be back shortly - " + new Date();
	}

	
}
