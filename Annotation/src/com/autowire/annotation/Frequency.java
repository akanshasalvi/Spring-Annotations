package com.autowire.annotation;

public class Frequency {

	private String signal_Type;
	private int tune;
	public String getSignal_Type() {
		return signal_Type;
	}
	public void setSignal_Type(String signal_Type) {
		this.signal_Type = signal_Type;
	}
	public int getTune() {
		return tune;
	}
	public void setTune(int tune) {
		this.tune = tune;
	}
	@Override
	public String toString() {
		return "Frequency [signal_Type=" + signal_Type + ", tune=" + tune + "]";
	}
	
	
}
