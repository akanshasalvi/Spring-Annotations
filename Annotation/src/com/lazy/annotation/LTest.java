package com.lazy.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lazy/annotation/lazy-bean.xml");
		//ApplicationContext context = new AnnotationConfigApplicationContext(LazyConfiguration.class);
		Motor motor = context.getBean("motor", Motor.class);
		System.out.println(motor);
	}

}
