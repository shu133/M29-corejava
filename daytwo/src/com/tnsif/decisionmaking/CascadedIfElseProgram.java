package com.tnsif.decisionmaking;
import java.util.Scanner;
public class CascadedIfElseProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the three value:");
		float percentage1=s.nextFloat();
		float percentage2=s.nextFloat();
		float percentage3=s.nextFloat();
		if(percentage1>percentage2 && percentage1>percentage3 )
		{
			System.out.println("person1 has high percentage");
			
		}
		else if(percentage2>percentage1 && percentage2>percentage3 )
		{
			System.out.println("person2 has high percentage");
		}
		else
		{
			System.out.println("person3 has high percentage");
		}
		

	}

}
