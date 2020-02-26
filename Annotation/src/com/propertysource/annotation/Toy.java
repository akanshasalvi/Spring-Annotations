package com.propertysource.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component

public class Toy {
	
	@Value("#{props.Tname}")
	private String toyname;
	
	@Value("#{props.Tprice}")
	private int price;
	
	@Value("#{props.Tcolor}")
	private String color;
	public String getToyname() {
		return toyname;
	}
	
	
	public void setToyname(String toyname) {
		this.toyname = toyname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Toy [toyname=" + toyname + ", price=" + price + ", color=" + color + "]";
	}
	
	

}
