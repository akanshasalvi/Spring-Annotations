package com.messagedriven.annotation;

import org.springframework.context.ApplicationEvent;

public class ReloadEvent extends ApplicationEvent {

	private String table;
	
	public ReloadEvent(Object source) {
		super(source);
	}

	public void setTable(String table) {
		this.table = table;
	}

	@Override
	public String toString() {
		return "ReloadEvent [table=" + table + "]";
	}

}
