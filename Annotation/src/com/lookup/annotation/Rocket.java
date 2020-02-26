package com.lookup.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Rocket {
	
	public void fire()
	{
		System.out.println("Rocket fired");
	}

}
