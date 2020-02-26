package com.messagedriven.annotation;

import org.springframework.context.event.EventListener;

public class ApplicationEventListener {
	
	@EventListener
	public void onApplicationEvent(ReloadEvent event)
	{
		System.out.println("Event:"+event.getSource());
	}

}
