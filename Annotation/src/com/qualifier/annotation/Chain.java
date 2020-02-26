package com.qualifier.annotation;

public class Chain {
	
	private int length;
	private String chain_type;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getChain_type() {
		return chain_type;
	}
	public void setChain_type(String chain_type) {
		this.chain_type = chain_type;
	}
	@Override
	public String toString() {
		return "Chain [length=" + length + ", chain_type=" + chain_type + "]";
	}
	
	

}
