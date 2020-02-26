package com.objectDep.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ObjectTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.objectDep.annotation");
		Patient patient = context.getBean("patient", Patient.class);
		System.out.println(patient);

	}

}
