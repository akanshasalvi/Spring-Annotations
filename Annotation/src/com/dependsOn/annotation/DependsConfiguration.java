package com.dependsOn.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class DependsConfiguration {
	@Bean
	@DependsOn("cache")        // it will consider method name as id and execute using byName
	public LoanManager loan()
	{
		return new LoanManager();
	}
	
	@Bean
	public CacheManager cache()
	{
		return new CacheManager();
	}

}
