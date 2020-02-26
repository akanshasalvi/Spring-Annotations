package com.required.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/required/annotation/required-beans.xml");
		Rocket rocket = context.getBean("rocket",Rocket.class);
		System.out.println(rocket);
	}

}
