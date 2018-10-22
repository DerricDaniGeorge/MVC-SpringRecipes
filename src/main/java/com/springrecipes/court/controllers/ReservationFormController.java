package com.springrecipes.court.controllers;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.springrecipes.court.beans.Player;
import com.springrecipes.court.beans.Reservation;
import com.springrecipes.court.exceptions.ReservationNotAvailableException;
import com.springrecipes.court.service.ReservationService;

@Controller
@RequestMapping("/reservationForm")
@SessionAttributes("reservation")
public class ReservationFormController {
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String setupForm(@RequestParam(required=false,value="userName") String userName,Model model) {
		Reservation reservation=new Reservation();
		Player player=new Player(null,null);
		reservation.setPlayer(player);
		model.addAttribute("reservation",reservation);
		model.addAttribute("sportTypes",reservationService.getAllSportTypes());
		return "reservationForm";
	}
	@ExceptionHandler(ReservationNotAvailableException.class)
	public ModelAndView handle(ReservationNotAvailableException ex) {
		ModelAndView model=new ModelAndView("reservationNotAvailable");
		model.addObject("ex",ex);
		return model;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submitForm(@ModelAttribute @Valid Reservation reservation,BindingResult result,SessionStatus status) {
		if(result.hasErrors()) {
			return "reservationForm";
		}else {
			reservationService.make(reservation);
			status.setComplete();
			//redirect means, browser will again request to "reservationSuccess"
			//so there must be a requestMapping in the controller to handle that request, otherwise
			//we will get http page not found error.
			return "redirect:reservationForm/reservationSuccess";
		}
		  
	}
	@RequestMapping("reservationSuccess")
	public String showSuccessPage() {
		return "reservationSuccess";
	}
}
