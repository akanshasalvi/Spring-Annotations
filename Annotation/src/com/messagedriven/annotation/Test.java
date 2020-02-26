package com.messagedriven.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.messagedriven.annotation");
		CityController city=context.getBean("cityController",CityController.class);
		city.addCity(1, "Pune");
		

	}

}
