package com.impResource.annotation;
//xml
public class Delivery {
	
	private String executive_name;
	private String receiver_name;
	public String getExecutive_name() {
		return executive_name;
	}
	public void setExecutive_name(String executive_name) {
		this.executive_name = executive_name;
	}
	public String getReceiver_name() {
		return receiver_name;
	}
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}
	@Override
	public String toString() {
		return "Delivery [executive_name=" + executive_name + ", receiver_name=" + receiver_name + "]";
	}
}
