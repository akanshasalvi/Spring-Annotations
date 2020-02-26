package com.messagedriven.annotation;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class CityController implements ApplicationEventPublisherAware{

	ApplicationEventPublisher publisher;
	ReloadEvent reload;
	
	public void addCity(int cityNo,String cityName)
	{
		System.out.println("Adding the City");
		reload=new ReloadEvent("cities");
		reload.setTable("cities");
		publisher.publishEvent(reload);	
	}
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}

}
