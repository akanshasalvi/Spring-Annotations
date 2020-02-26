package com.imprt.annotation;

//no source code
public class Ticket {
	
	private int ticketNo;
	private String source;
	private String destination;
	private Passenger passenger;
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	@Override
	public String toString() {
		return "Ticket [ticketNo=" + ticketNo + ", source=" + source + ", destination=" + destination + ", passenger="
				+ passenger + "]";
	}
}
