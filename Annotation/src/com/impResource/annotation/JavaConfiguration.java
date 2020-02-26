package com.impResource.annotation;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.objectDep.annotation.Appointment;

@Configuration
@ImportResource({"com/impResource/annotation/application-context.xml"})
@PropertySource("classpath:com/impResource/annotation/parcel.properties")
@ComponentScan(basePackages = "com.impResource.annotation")
public class JavaConfiguration {
	
	@Autowired
	private Environment env;
	
	@Bean(autowire = Autowire.BY_TYPE)   
	public Parcel receiver()
	{
		Parcel receiver = new Parcel();
		
		return receiver;
	}
}
