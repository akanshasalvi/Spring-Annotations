package com.autowire.annotation;

public class NoiseController {
	private String noiseFreq;
	private String volume;

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getNoiseFreq() {
		return noiseFreq;
	}

	public void setNoiseFreq(String noiseFreq) {
		this.noiseFreq = noiseFreq;
	}

	@Override
	public String toString() {
		return "NoiseController [noiseFreq=" + noiseFreq + ", volume=" + volume + "]";
	}

	
	
	
}
