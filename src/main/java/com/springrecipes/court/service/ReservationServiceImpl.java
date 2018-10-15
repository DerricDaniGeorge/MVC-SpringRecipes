package com.springrecipes.court.service;

import com.springrecipes.court.beans.SportType;
import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import com.springrecipes.court.beans.Reservation;
import com.springrecipes.court.beans.Player;
public class ReservationServiceImpl implements ReservationService {
	public static final SportType TENNIS=new SportType(1,"Tennis");
	public static final SportType SOCCER=new SportType(2,"Soccer");
	private List<Reservation> reservations;
	
	public ReservationServiceImpl() {
		reservations=new ArrayList<>();
		reservations.add(new Reservation("Tennis #1",new GregorianCalendar(2008,0,14).getTime(),16,new Player("James","N/A"),TENNIS));
	}
	public List<Reservation> query(String courtName){
		List<Reservation> result=new ArrayList<>();
		for(Reservation reservation:reservations) {
			if(reservation.getCourtName().equals(courtName)) {
				result.add(reservation);
			}
		}
		return result;
	}
}
