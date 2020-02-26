package com.dependsOn.annotation;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component   // makes this class as bean defination, id is taken as class name in small letters
public class CacheManager {
	
	public CacheManager() {
		System.out.println("cache manager");
	}

}
