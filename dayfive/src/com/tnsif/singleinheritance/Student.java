package com.tnsif.singleinheritance;
//child class
public class Student extends Citizen 
{
private String college;
private int rollno;
//default 
public Student() {
	super();
	
}
//parameterized
public Student(String college, int rollno) {
	super();
	this.college = college;
	this.rollno = rollno;
}
public Student(String string, String string2, String string3, long l, String string4, int i) {
	// TODO Auto-generated constructor stub
}
//getter & setter
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
@Override
public String toString() {
	return "Student [college=" + college + ", rollno=" + rollno + "]";
}



}

	

	
	
	

	
