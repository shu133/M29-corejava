package com.tnsif.entities;

public class Student {
	//private data members
	private int rollno;
	private String name;
	//default constructor
	public Student() {
		
	}
	//parameterized constructor
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	//getter and setter
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("Student [rollno=%s, name=%s]", rollno, name);
	}
	
	
	

}
