package com.profile.annotation;

//source code
public class Branch {
	
	private String branchNo;
	private String branchName;
	private String contactNo;
	private Address address;
	public String getBranchNo() {
		return branchNo;
	}
	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Branch [branchNo=" + branchNo + ", branchName=" + branchName + ", contactNo=" + contactNo + ", address="
				+ address + "]";
	}
	
	
	
	

}
