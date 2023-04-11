package com.tnsfi.classandobject;

public class Customer {
	//private data
	private int customerID;
	private String customerName;
	private String city;
	
	//constructor does note have any return type
	
    //default constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
    //parameterize constructor
	public Customer(int customerID, String customerName, String city) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.city = city;
	}
	

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", city=" + city
				+ ", getCustomerID()=" + getCustomerID() + ", getCustomerName()=" + getCustomerName() + ", getCity()="
				+ getCity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
