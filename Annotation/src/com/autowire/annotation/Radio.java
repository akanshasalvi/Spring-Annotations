package com.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Radio {

	Frequency frequency;
	NoiseController noise;
	
//	@Autowired
//	public Radio(NoiseController noise) {
//		this.noise = noise;
//	}
	
//	@Autowired(required = false)  //for required = false if dependencies are avail then it will inject those 
//	public Radio(Frequency frequency, NoiseController noise) {
//		this.frequency = frequency;
//		this.noise = noise;
//		System.out.println("2 args constructor");
//	}


//	@Autowired
//	public Radio() {
//		super();
//	}
	@Autowired
	public void init(Frequency frequency, NoiseController noise )
	{
		this.frequency = frequency;
		this.noise = noise;
	}
	
	public Frequency getFrequency() {
		return frequency;
	}

	@Autowired(required = false) // Autowired means mandatory injection // required by default is true, if we make it true means
								// it will anyhow inject but values are not available then dependencies will be null
	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Radio [frequency=" + frequency + ", noise=" + noise + "]";
	}

	
	
	
	
	
	
}
