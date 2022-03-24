package com.coforge.training.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.model.Item;
import com.coforge.training.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	private Logger log = LoggerFactory.getLogger(UserRestController.class);
	
	@Autowired
	private UserService uService;
	
	@GetMapping("/allitems")
	public ResponseEntity<List<Item>> getItemInfo(){
		log.info("Inside User Microservice");
		return uService.getAllItems();
	}
}
