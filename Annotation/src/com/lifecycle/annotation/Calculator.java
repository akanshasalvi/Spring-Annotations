package com.lifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	private int a;
	private int b;
	private int sum;
	
	
	public Calculator(@Value("30")int a) 
	{
		this.a = a;
	}
	
	@Value("10")
	public void setB(int b) {
		this.b = b;
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("init() method");
		this.sum = this.a + this.b;
		System.out.println("Calculation is:" +sum);
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Cleaning..");
		
	}
}
