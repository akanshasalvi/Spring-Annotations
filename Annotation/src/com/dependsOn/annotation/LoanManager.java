package com.dependsOn.annotation;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("loan")
//@DependsOn("cacheManager")
public class LoanManager {

	public LoanManager() {
		System.out.println("loan manager");
	}
	
	

}
