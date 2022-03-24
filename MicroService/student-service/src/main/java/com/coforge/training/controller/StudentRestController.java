package com.coforge.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.service.BookRestConsumer;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@Autowired
	private BookRestConsumer bookRestConsumer;
	
	@GetMapping("/allbooks")
	public String getBookInfo() {
			return "Accessing from Studnet Service through Feign client -> "+
					bookRestConsumer.getAllBooks();
	}
	
	@GetMapping("/getbook/{id}")
	public String getBook(@PathVariable Integer id) {
			return "Accessing from Studnet Service through Feign client -> "+
					bookRestConsumer.getBookById(id);
	}
	
	@GetMapping("/data")
	public String getStudentInfo() {
	System.out.println(bookRestConsumer.getClass().getName()); //prints as a proxy class
	return "Accessing from STUDENT-SERVICE ==> " +bookRestConsumer.getBookData();
	}
	
	@GetMapping("/entityData")
	public String printEntityData() {
	ResponseEntity<String> resp = bookRestConsumer.getEntityData();
	return "Accessing from STUDENT-SERVICE ==> " + resp.getBody() +" , status is:" + resp.getStatusCode();
	}
}
