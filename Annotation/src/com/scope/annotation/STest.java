package com.scope.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class STest {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/scope/annotation/scope-beans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
		Rocket rocket1 = context.getBean("car", Rocket.class);
		Rocket rocket2 = context.getBean("car",Rocket.class);
		System.out.println("rocket1 == rocket2 := " +(rocket1==rocket2));

	}

}
