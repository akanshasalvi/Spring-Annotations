package com.impResource.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		Parcel parcel = context.getBean("receiver", Parcel.class);
		System.out.println(parcel);

	}

}
