package com.tnsif.methodoverloading;
//driver class
//program to demonstrate on method overloading
public class MethodOverloadingExecutor{ 

	public static void main(String[] args) {
		MethodOverloadinExample m1=new MethodOverloadinExample();
		System.out.println(m1.multiplication(12.5f, 3.0f));
		System.out.println(m1.multiplication(1.5f,4));
		System.out.println(m1.multiplication(5,15.5f));
		System.out.println(m1.multiplication(2,7));
		System.out.println(m1.print("welcome to c2tc"));
		System.out.println(m1.print("shubhangi","Ghorkhana"));
		

	}

}
