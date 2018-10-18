package com.springrecipes.court.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.springrecipes.court.service.ReservationService;
import org.springframework.ui.Model;
import java.util.List;
import com.springrecipes.court.beans.Reservation;
@Controller
@RequestMapping("/reservationQuery")
public class ReservationQueryController {
	private ReservationService reservationService;
	
	public void setReservationService(ReservationService reservationService) {
		this.reservationService=reservationService;
	}
	@RequestMapping(method=RequestMethod.GET)
	public void setupForm() {
	}
	@RequestMapping(method=RequestMethod.POST)
	public String submitForm(@RequestParam("courtName")String courtName,Model model) {
		List<Reservation> reservations=java.util.Collections.emptyList();
		if(courtName!=null) {
			reservations=reservationService.query(courtName);
		}
		model.addAttribute("reservations",reservations);
		return "reservationQuery";
	}
}
