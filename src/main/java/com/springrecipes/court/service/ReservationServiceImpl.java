package com.springrecipes.court.service;

import com.springrecipes.court.beans.SportType;
import java.util.Arrays;
import com.springrecipes.court.exceptions.ReservationNotAvailableException;

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
	public void make(Reservation reservation) {
		for(Reservation made:reservations) {
			if(made.getCourtName().equalsIgnoreCase(reservation.getCourtName())&&made.getDate().equals(reservation.getDate())&&made.getHour()==reservation.getHour()) {
				throw new ReservationNotAvailableException(reservation.getCourtName(),reservation.getDate(),reservation.getHour());
			}
		}
		reservations.add(reservation);
	}
	public List<SportType> getAllSportTypes(){
		return Arrays.asList(new SportType[] {TENNIS,SOCCER});
	}
}
