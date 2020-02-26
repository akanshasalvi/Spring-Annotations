package com.objectDep.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//have source code
@Component
@PropertySource("classpath:com/objectDep/annotation/patient.properties")
public class Patient {
	
	@Value("${Name}")
	private String pname;
	
	@Value("${Age}")
	private int age;
	
	@Value("${Gender}")
	private String gender;
	
//	public String getPname() {
//		return pname;
//	}
//	public void setPname(String pname) {
//		this.pname = pname;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
	
	@Override
	public String toString() {
		return "Patient [pname=" + pname + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
