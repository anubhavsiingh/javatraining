package com.coforge.training.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.coforge.training.model.Item;

@Service
public class UserService implements ItemServiceClient {
	
	private Logger log = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private ItemServiceClient client;		//Instance of feign client
							
	@Override
	public List<Item> getItems(Long userId) {
		// TODO Auto-generated method stub
		return client.getItems(userId);
	}
											//Consume Item microservice using feign client
	@Override
	public ResponseEntity<List<Item>> getAllItems() {
		log.info("In User Microservice - Service Imp");
		return client.getAllItems();
	}

}
