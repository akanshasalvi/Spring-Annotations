package com.lifecycle.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LCTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		Calculator calculator = context.getBean("calculator", Calculator.class);
		((ConfigurableApplicationContext)context).registerShutdownHook();

	}

}
