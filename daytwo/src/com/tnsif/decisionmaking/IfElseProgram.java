package com.tnsif.decisionmaking;
import java.util.Scanner;

public class IfElseProgram {
	/*If we have two condition to decide then we will use if--else */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age and weight of a"+"donor");
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate the blood");
		}
		else
		{
			System.out.println("not eligible to donate the blood");
		}
		

	}

}
