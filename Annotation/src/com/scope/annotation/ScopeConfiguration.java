package com.scope.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class ScopeConfiguration {
	@Bean(value = "car")      //by default it will take the bean as byName
	@Scope("prototype")
	public Rocket rocket()
		  //class  id
	{
		return new Rocket();
	}

}
