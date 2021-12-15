package com.coforge.training.ims.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.training.ims.model.Address;
import com.coforge.training.ims.model.Dealer;
import com.coforge.training.ims.model.Product;
import com.coforge.training.ims.service.LoginService;
import com.coforge.training.ims.service.ProductService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService lService;
	
	@Autowired
	private ProductService pService;
	
	
	@RequestMapping("/")
    public String viewHomePage() {
        return "index";
    }
	
	@RequestMapping("/register")
    public String viewRegisterPage(Model model) {
		Dealer dealer = new Dealer();
		model.addAttribute("dealer",dealer);
        return "register";    //Returns Model(Dealer) + view(register)
    }
	
	@PostMapping("/saveDealer")
	public String saveDealer(HttpServletRequest req,@ModelAttribute("dealer") Dealer dealer) {
		String street = req.getParameter("street");
		String city = req.getParameter("city");
		int pincode = Integer.parseInt(req.getParameter("pincode"));
		
		Address a = new Address();
		a.setStreet(street);
		a.setCity(city);
		a.setPincode(pincode);
		
		dealer.setAddress(a);
		a.setDealer(dealer);
		
		lService.saveDealer(dealer);   //Invokes service layer methods for database logic implementation
		return "index";			//User form -> Controller -> service -> Repository(DAO) ->JPA Repo -> Database
	}
	
	@GetMapping("/login")
	public String showLoginForm(Model theModel) {

	return "login";
	}
	
	@PostMapping("/loginDealer")
	public ModelAndView loginDealer(HttpServletRequest req,@ModelAttribute("dealer") Dealer dealer) {
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		String pass2=encryptPass(pass); //invokes encryptPass() method
		
		StringTokenizer st = new StringTokenizer(email, "@"); // breaks the email id based on '@' token
		String s2 = st.nextToken(); //email id without domain
		
		ModelAndView mav = null;
		Dealer d = lService.FindByEmail(email); // Fetch record/objects  from table matching the email id
		if (d==null){
			mav = new ModelAndView("login");
			mav.addObject("error","User doesn't exist");
		}
		else if(email.equals(d.getEmail()) && pass2.equals(d.getPassword()))
		{
		req.getSession().setAttribute("user", s2); // creating a session
		mav = new ModelAndView("product");
		mav.addObject("dealer", d);
		
		List<Product> listProducts = pService.listAll();	// Fetches all records from Product table
		mav.addObject("listProducts", listProducts);
		}
		else
		{
		mav= new ModelAndView("login");
		mav.addObject("error", "Invalid Password");
		}
		return mav;
	}
	
	private String encryptPass(String pass) {
		Base64.Encoder encoder = Base64.getEncoder();
		String normalString = pass;
		String encodedString = encoder.encodeToString(
		normalString.getBytes(StandardCharsets.UTF_8) );
		return encodedString;
		}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest req) {
	req.getSession().removeAttribute("user");
	req.getSession().invalidate();
	return "index";
	}
}
