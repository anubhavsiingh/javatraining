package com.coforge.training.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController annotation in order to simplify the creation of RESTful web services. It is a specialized version of the controller.
It's a convenient annotation that combines @Controller and @ResponseBody, which eliminates the need to annotate every request handling method of the controller class with the @ResponseBody annotation.
*/

@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String hello() {
		return "hello from spring rest web services"; 
	}

}
