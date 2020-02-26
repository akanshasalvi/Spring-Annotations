package com.lookup.annotation;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class JavaConfiguration implements ApplicationContextAware{
	
	private ApplicationContext context;
	
	@Bean
	public Launcher launcher()
	{
		return new Launcher() {
			public Rocket lookUpRocket() {
				return context.getBean("rocket", Rocket.class);
			}
			
		};
	}
	
	@Bean 
	@Scope("prototype")
	public Rocket rocket()
	{
		return null;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
		
	}

}
