package com.coforge.training.springweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String showLoginForm()
    {
        return "login";  //return view name
    }
	
	@RequestMapping("/checkUser")
	public String showForm(HttpServletRequest req, Model m) {
		String uname = req.getParameter("uname");
		String psw = req.getParameter("psw");
		
		if(psw.equals("testing"))
        {
            String msg="Welcome "+uname;
            m.addAttribute("message", msg);
            return "Success";
        }
        else
        {
            String msg="Sorry "+uname+". You entered Incorrect Password.";
            m.addAttribute("message", msg);
            return "errorPage";
        }
		
	}
}
