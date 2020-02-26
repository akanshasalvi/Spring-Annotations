package com.lifecycle.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {
	
	@Bean
	public Calculator calculator()
	{
		Calculator calculator;
		return new Calculator(50);
	}

}
