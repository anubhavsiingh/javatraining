package com.coforge.training.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.training.model.Book;

/*@FeignClient annotation provides the name of producer service/application.
 * Declare methods of the service provider class i.e Book service here*/

@FeignClient(name="BOOK-SERVICE")			//name is tellig who is the provider
public interface BookRestConsumer {			//Interface for consumer
	
	@GetMapping("/book/data")
	public String getBookData();


	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable Integer id);


	@GetMapping("/book/all")
	public List<Book> getAllBooks();

	
	@GetMapping("/book/entity")
	public ResponseEntity<String> getEntityData();
}
