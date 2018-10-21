package com.springrecipes.court.service;
import java.util.List;
import com.springrecipes.court.beans.Reservation;
import com.springrecipes.court.beans.SportType;
import com.springrecipes.court.exceptions.ReservationNotAvailableException;
public interface ReservationService {
	public List<Reservation> query(String courtName);
	public void make(Reservation reservation) throws ReservationNotAvailableException;
	public List<SportType> getAllSportTypes();
}
