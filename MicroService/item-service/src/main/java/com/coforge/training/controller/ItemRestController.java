package com.coforge.training.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.model.Item;
import com.coforge.training.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemRestController {
	
	private Logger log = LoggerFactory.getLogger(ItemRestController.class);
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping(value ="/all")
	public ResponseEntity<List<Item>> findItems(){
		log.info("Inside Item Microservice");
	return new ResponseEntity<>(itemService.findAllItems(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Item> addNewItem(@RequestBody Item item){
	return new ResponseEntity<Item>(itemService.saveNewItem(item), HttpStatus.CREATED);
	}



	@GetMapping(value = "/user-items")
	public ResponseEntity<List<Item>> getItemByUserId(@RequestParam(value = "userId") Long userId){
	return new ResponseEntity<List<Item>>(itemService.findAllItemsByUserId(userId), HttpStatus.OK);
	}

}
