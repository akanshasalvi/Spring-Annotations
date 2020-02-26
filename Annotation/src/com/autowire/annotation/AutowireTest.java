package com.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.required.annotation.Rocket;

public class AutowireTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowire/annotation/autowire-beans.xml");
		Radio radio = context.getBean("radio",Radio.class);
		System.out.println(radio);
	}

}
