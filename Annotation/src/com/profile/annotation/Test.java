package com.profile.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext();
		((ConfigurableApplicationContext)context).getEnvironment().setActiveProfiles("dev");
		((AnnotationConfigApplicationContext)context).register(RootConfiguration.class);
		((ConfigurableApplicationContext)context).refresh();
		
		Branch branch = context.getBean("branch", Branch.class);
		System.out.println(branch);

	}

}
