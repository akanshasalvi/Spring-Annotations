package com.scope.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
//@Scope("prototype")
public class Rocket {
	
	private String rocket_name;
	private String fuel_type;
	public String getRocket_name() {
		return rocket_name;
	}
	public void setRocket_name(String rocket_name) {
		this.rocket_name = rocket_name;
	}
	public String getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	@Override
	public String toString() {
		return "Rocket [rocket_name=" + rocket_name + ", fuel_type=" + fuel_type + "]";
	}
	
}
