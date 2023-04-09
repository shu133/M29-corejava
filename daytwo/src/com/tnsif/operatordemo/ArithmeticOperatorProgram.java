package com.tnsif.operatordemo;
import java.util.Scanner;

public class ArithmeticOperatorProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println("The addition of two numbers:"+(x+y));
		System.out.println("The subtraction of two numbers:"+(x-y));
		System.out.println("The multiplication of two numbers:"+(x*y));
		System.out.println("The division of two numbers:"+(x/y));
		System.out.println("The modulo of two numbers:"+(x%y));
		
	}

}
