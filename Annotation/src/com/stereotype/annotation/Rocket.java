package com.stereotype.annotation;

import org.springframework.stereotype.Component;

@Component()  //define rocket class as a bean definition
public class Rocket {
	
	private String rocket_name;
	private int fuel;
	public String getRocket_name() {
		return rocket_name;
	}
	public void setRocket_name(String rocket_name) {
		this.rocket_name = rocket_name;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	@Override
	public String toString() {
		return "Rocket [rocket_name=" + rocket_name + ", fuel=" + fuel + "]";
	}
}
