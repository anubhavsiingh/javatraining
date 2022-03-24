package com.coforge.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/payment")
public class PaymentRestController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getData")
	public String getPaymentData() {
		String response = restTemplate.getForObject("hhtp://CART-SERVICE/cart/getData", String.class);
		return "From Payment Service"+ response;
	}
}
