package com.impResource.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/impResource/annotation/customer.properties")
public class Customer {
	
	@Value("${name}")
	private String customer_name;
	@Value("${gender}")
	private String customer_gender;
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_gender() {
		return customer_gender;
	}
	public void setCustomer_gender(String customer_gender) {
		this.customer_gender = customer_gender;
	}
	@Override
	public String toString() {
		return "Customer [customer_name=" + customer_name + ", customer_gender=" + customer_gender + "]";
	}
	
	
}
