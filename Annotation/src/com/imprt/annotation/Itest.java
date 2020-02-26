package com.imprt.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Itest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfiguration.class);
		Ticket ticket = context.getBean("ticket", Ticket.class);
		System.out.println(ticket);
	}

}
