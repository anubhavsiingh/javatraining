package com.coforge.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartRestController {
	
	@GetMapping("/getData")
	public String getCartData() {
		return "returning Data from CART_SERVICE";
	}
}
