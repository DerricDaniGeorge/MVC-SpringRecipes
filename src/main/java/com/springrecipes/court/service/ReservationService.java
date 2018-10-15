package com.springrecipes.court.service;
import java.util.List;
import com.springrecipes.court.beans.Reservation;
public interface ReservationService {
	public List<Reservation> query(String courtName);
}
