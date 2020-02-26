package com.primitiveDep.annotation;

import org.springframework.stereotype.Component;

//No Source

public class Patient {
	private String pname;
	private int age;
	private String gender;
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Patient [pname=" + pname + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
