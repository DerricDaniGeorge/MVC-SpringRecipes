package com.springrecipes.court.exceptions;
import java.util.Date;
public class ReservationNotAvailableException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ReservationNotAvailableException(String courtName,Date date,int hour) {
		this.courtName=courtName;
		this.date=date;
		this.hour=hour;
	}
	
	private String courtName;
	private Date date;
	private int hour;
	public String getCourtName() {
		return courtName;
	}
	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	
}
