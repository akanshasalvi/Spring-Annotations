package com.objectDep.annotation;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/objectDep/annotation/appointment.properties")
@ComponentScan(basePackages = "com.objectDep.annotation")
public class JavaConfiguration {
	
	@Autowired
	private Environment env;
	
	@Bean(autowire = Autowire.BY_TYPE)   // here constructor will not work
	public Appointment appointment()
	//     class(type) -   id
	{
		Appointment appoint = new Appointment();
		appoint.setAppointmentNo(Integer.parseInt(env.getProperty("AppointmentNo")));
		appoint.setDoctorName(env.getProperty("DoctorName"));
		return appoint;
	}

}
