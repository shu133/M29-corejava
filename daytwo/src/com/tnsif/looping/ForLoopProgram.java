//program to demonstrate on for loop
package com.tnsif.looping;

import java.util.Scanner;

public class ForLoopProgram {

	public static void main(String[] args) {
		//print 1 to N number
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int N=s.nextInt();
		for(int i=1;i<=N;i++)
		{
			System.out.println(i+" ");
		}

	}

}
