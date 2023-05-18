package com.tnsif.statickeyword;

public class StaticKeyWordExecutor {

	public static void main(String[] args) {
		/*
		 * Without creating the object,we will 
		 * get the value for static variable 
		 */
		System.out.println(Employee.companyName);
		Employee e = new Employee(101,"shubhangi ghorkhana");
		System.out.println(e);
		
		Employee e1 = new Employee(102," Priti Ghodke");
		System.out.println(e1);
		
		Customer.display();
		Customer c = new Customer();
		System.out.println(c);
		

	}

}
