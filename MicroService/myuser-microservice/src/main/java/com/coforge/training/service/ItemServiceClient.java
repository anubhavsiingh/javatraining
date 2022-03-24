package com.coforge.training.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coforge.training.model.Item;

/*FeignClient is used to consume RESTFul API endpoints exposed by thirdparty or microservice.*/

/*FeignClient is a Declarative REST Client in Spring Boot Web Application.
 Declarative REST Client means you just give the client specification 
as an Interface and spring boot takes care of the implementation for you.*/

@FeignClient(name="item-service")
public interface ItemServiceClient {
	
	@GetMapping(value = "/item/user-items")		//Mapping is same as in itemController to fetch
	public List<Item> getItems(@RequestParam Long userId);

	@GetMapping("/item/all")
	public ResponseEntity<List<Item>> getAllItems();
}
