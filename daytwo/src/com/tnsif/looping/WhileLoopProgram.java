//program to demonstrate on while loop
package com.tnsif.looping;

import java.util.Scanner;

public class WhileLoopProgram {

	public static void main(String[] args) {
		//print 1 to n
		int i=1;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int N=s.nextInt();
		while(i<=N)
		{
			System.out.print(i+" ");
			i++;
		}

	}

}
