//program to demonstrate on class,object and constructor
//driver class
package com.tnsfi.classandobject;
import java.util.Scanner;

public class CunstructorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id;
		String city,name;
		System.out.println("enter the customer ID:");
		id=s.nextInt();
		//to read next line
		s.nextLine();
		System.out.println("enter the customer Name:");
		name=s.nextLine();
		System.out.println("enter the customer city:");
		city=s.nextLine();
		//object
		Customer c=new Customer();
		c.setCustomerID(id);
		c.setCity(city);
		c.setCustomerName(name);
		System.out.println(c);
		Customer c1=new Customer(id,city,name);
		System.out.println(c1);
		

	}

}
