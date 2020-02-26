package com.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotype/annotation/stereotype-beans.xml");
		Rocket rocket = context.getBean("rocket",Rocket.class);
		System.out.println(rocket);
	}

}
