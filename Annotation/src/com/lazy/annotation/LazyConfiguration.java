package com.lazy.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LazyConfiguration {
	
	@Bean
	public Motor motor()
	{
		return new Motor();
	}

}
