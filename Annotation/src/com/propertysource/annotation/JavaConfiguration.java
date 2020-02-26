package com.propertysource.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {"classpath:com/propertysource/annotation/propertySource.properties"})
public class JavaConfiguration {
	
	@Bean
	public Toy getToy()
	{
		return new Toy();
	}

}
