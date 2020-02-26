package com.lazy.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy(true)  //by default ApplicationContext is eager, set it lazy by using lazy=true 
public class Motor {
	
	@Value("100")
	private int capacity;
	@Value("Amex")
	private String motor_name;
	
	public Motor() {
		System.out.println("Made ApplicationContext as Lazy Instantiation");
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getMotor_name() {
		return motor_name;
	}
	public void setMotor_name(String motor_name) {
		this.motor_name = motor_name;
	}
	@Override
	public String toString() {
		return "Motor [capacity=" + capacity + ", motor_name=" + motor_name + "]";
	}
}
