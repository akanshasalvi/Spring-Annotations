package com.primitiveDep.annotation;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = {"classpath:com/primitiveDep/annotation/patient.properties","classpath:com/primitiveDep/annotation/appointment.properties"})
@ComponentScan(basePackages = "com.primitiveDep.annotation")
public class JavaConfiguration {
	@Autowired
	private Environment env;

	@Bean(autowire = Autowire.BY_NAME)
	public Patient patient() {
		Patient patient = new Patient();
		patient.setPname(env.getProperty("Name"));
		patient.setAge(Integer.parseInt(env.getProperty("Age")));
		patient.setGender(env.getProperty("Gender"));
		return patient;
	}

}
