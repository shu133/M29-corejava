//program to demonstrate on single inheritance
//perant class
package com.tnsif.singleinheritance;

public class Citizen {
	private String name;
	private String aadharNo;
	private String city;
	private long contactNo;
//	default constructor
	public Citizen() {
		super();
		
	}
//	parameterized constructor
public Citizen(String name, String aadharNo, String city, long contactNo) {
	super();
	this.name = name;
	this.aadharNo = aadharNo;
	this.city = city;
	this.contactNo = contactNo;
}
	//getter and setter
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAadharNo() {
	return aadharNo;
}
public void setAadharNo(String aadharNo) {
	this.aadharNo = aadharNo;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public long getContactNo() {
	return contactNo;
}
public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}
//when you print object,it class to toString() method
@Override
public String toString() {
	return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", city=" + city + ", contactNo=" + contactNo + "]";
}

	
}