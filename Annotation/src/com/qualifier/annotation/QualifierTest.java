package com.qualifier.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/qualifier/annotation/qualifier-beans.xml");
		Bicycle cycle = context.getBean("bicycle", Bicycle.class);
		System.out.println(cycle);
		

	}

}
