package com.messagedriven.annotation;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationEventListener {
	
	@EventListener
	public void onApplicationEvent(ReloadEvent event)
	{
		System.out.println("Event:"+event.getSource());
	}

}
