//program to demonstrate on user input

package com.tnsif.userinputdemo;

import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your salary ");
		float salary=s.nextFloat();
		System.out.println("enter your name ");
		//next() is used to get first word sentence of your sentence
		String name=s.next();
		s.nextLine();
		System.out.println("enter your name1: ");
		String name1=s.nextLine();
		System.out.println("enter your character: ");
		char ch=s.next().charAt(1);
		
		
		System.out.println("salary is: "+salary);
		System.out.println("name is:"+name);
		System.out.println("name is:"+name1);
		System.out.println("character is:"+ch);
		s.close(); 
	}

}
