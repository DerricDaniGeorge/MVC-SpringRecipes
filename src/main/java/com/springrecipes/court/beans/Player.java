package com.springrecipes.court.beans;

public class Player {
	private String name,phone;
	
	public Player(String name,String phone) {
		this.name=name;
		this.phone=phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
