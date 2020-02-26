package com.dependsOn.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DTest {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/dependsOn/annotation/depends-bean.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(DependsConfiguration.class);
		LoanManager loan = context.getBean("loan", LoanManager.class);
		
	}

}

