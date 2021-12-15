package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coforge.training.springweb.model.Employee;
import com.coforge.training.springweb.model.Reservation;

@Controller
public class ReservationController {
	
	@RequestMapping("/bookingForm")
    public String showFormForAdd(Model theModel) {
        Reservation res = new Reservation();
        theModel.addAttribute("reservation", res);
        return "reservationPage"; //it has emp obj
    }
	
	@RequestMapping(value="/submitForm", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("reservation") Reservation reservation) {
    	//model.addAttribute("name", reservation.getFirstName() + reservation.getLastName());
    	//model.addAttribute("city", reservation.getCityFrom() + "to"+ reservation.getCityTo());
    	//model.addAttribute("gender", reservation.getGender());
    	return "reservationConfirm";			// It has reservation object so directly accesing using jstl
    }

}
