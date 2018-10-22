package com.springrecipes.court.beans;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Reservation {
	@NotNull
	@Size(min=3,max=15)
	private String courtName;
	private Date date;
	private int hour;
	private Player player;
	private SportType sportType;
	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}
	public Reservation() {}
	public Reservation(String courtName, Date date, int hour, Player player, SportType sportType) {
		super();
		this.courtName = courtName;
		this.date = date;
		this.hour = hour;
		this.player = player;
		this.sportType = sportType;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public void setSportType(SportType sportType) {
		this.sportType = sportType;
	}
	public String getCourtName() {
		return courtName;
	}
	public Date getDate() {
		return date;
	}
	public int getHour() {
		return hour;
	}
	public Player getPlayer() {
		return player;
	}
	public SportType getSportType() {
		return sportType;
	}
	
	
}
