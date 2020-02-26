package com.imprt.annotation;

//no source code
public class Passenger {
	
	private String name;
	private String gender;
	private String mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", gender=" + gender + ", mobile=" + mobile + "]";
	}
	
}
