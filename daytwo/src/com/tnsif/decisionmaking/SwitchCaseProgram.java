package com.tnsif.decisionmaking;
import java.util.Scanner;
public class SwitchCaseProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the song input:");
		int songInput=sc.nextInt();
		switch(songInput)
		{
		case 1:
			System.out.println("calm down");
			break;
		case 2:
			System.out.println("mnva laage");
			break;
		case 3:
			System.out.println("chal chaiyya chaiyya");
			break;
		default:
			System.out.println("invalid entry");
			break;
	}
		sc.close();
		
		

	}

}
