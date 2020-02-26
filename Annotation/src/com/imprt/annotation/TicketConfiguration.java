package com.imprt.annotation;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/imprt/annotation/ticket.properties")
public class TicketConfiguration {
	@Autowired
	private Environment env; 
	
	@Bean(autowire = Autowire.BY_TYPE)
	public Ticket ticket()
	{
		Ticket ticket = new Ticket();
		ticket.setTicketNo(Integer.parseInt(env.getProperty("ticketNo")));
		ticket.setSource(env.getProperty("source"));
		ticket.setDestination(env.getProperty("destination"));
		return ticket;
	}
}
