package com.coforge.training.springweb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/myhome", method = RequestMethod.GET)
    public String showHome(ModelMap model) {
       model.addAttribute("user", "Klaus");
       model.addAttribute("d", new java.util.Date());
           return "Home";  // return model(data) + view name
       }
	
	@RequestMapping("/hello")
	public String showHello() {
		return "second";
	}
	
}
