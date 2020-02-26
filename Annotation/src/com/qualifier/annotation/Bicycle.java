package com.qualifier.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bicycle {

	Chain chain;

	public Chain getChain() {
		return chain;
	}

	@Autowired
	@Qualifier()  // to avoid ambiguity between 2 chain bean definitions 
	
	public void setChain(Chain chain) {
		this.chain = chain;
	}

	@Override
	public String toString() {
		return "Bicycle [chain=" + chain + "]";
	}
}
