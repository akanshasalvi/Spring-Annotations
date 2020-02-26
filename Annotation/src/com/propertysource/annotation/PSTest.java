package com.propertysource.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PSTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/propertysource/annotation/source.xml");
		//ApplicationContext context = new AnnotationConfigApplicationContext("com/propertysource/annotation");
		//ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		Toy toy = context.getBean("getToy", Toy.class);
		System.out.println(toy);
	}

}
