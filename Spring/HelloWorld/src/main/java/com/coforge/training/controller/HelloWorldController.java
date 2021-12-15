package com.coforge.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@GetMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@PostMapping("/test")
	public String seyHello(@RequestParam("name") String name,Model model) {
		model.addAttribute("name", name);
		return "hello";
	}
}
