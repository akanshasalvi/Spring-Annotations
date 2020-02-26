package com.impResource.annotation;
//config
public class Parcel {
	
	private Customer sender;
	private Customer receiver;
	private Delivery delivery;
	public void setSender(Customer sender) {
		this.sender = sender;
	}
	public void setReceiver(Customer receiver) {
		this.receiver = receiver;
	}
	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}
	@Override
	public String toString() {
		return "Parcel [sender=" + sender + ", receiver=" + receiver + ", delivery=" + delivery + "]";
	}
	
		
	
	
}
