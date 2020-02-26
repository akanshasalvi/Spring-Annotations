package com.lookup.annotation;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Launcher {
	
	public void launch()
	{
		Rocket rocket = lookUpRocket();
		rocket.fire();
	}
	
	@Lookup
	public Rocket lookUpRocket()
	{
		return null;
	}

}
