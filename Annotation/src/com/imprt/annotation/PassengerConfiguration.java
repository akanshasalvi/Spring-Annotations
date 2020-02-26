package com.imprt.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/imprt/annotation/passenger.properties")
public class PassengerConfiguration {
	
	@Autowired
	private Environment env;
	
	@Bean
	public Passenger passenger()
	{
		Passenger passenger = new Passenger();
		passenger.setName(env.getProperty("name"));
		passenger.setGender(env.getProperty("gender"));
		passenger.setMobile(env.getProperty("mobile"));
		return passenger;
	}
	
	

}
