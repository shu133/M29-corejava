package org.tnsif.memoriseme;
//import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class MemariseMe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String name = br.readLine();
		//System.out.println("Hi,"+ name+ ".");
		//Scanner s = new Scanner(System.in);
		//String name1 = s.nextLine();
		//System.out.println("Hi,"+ name1+ ".");
		String noEle= br.readLine();
		int n= Integer.parseInt(noEle);
		int i=0;
		String[] numberArray = br.readLine().split("");
		String noQue= br.readLine();
		int q= Integer.parseInt(noQue);
		String[] queries =new String[q];
		for(i=0;i<q;i++) {
			String query = br.readLine();
			String queryNumber = query.trim();
			queries[i]=queryNumber;
			
		}
		for(i=0;i<queries.length;i++) {
			int count=0;
			for(int j=0; j<n;j++) {
				if(queries[i].equals(numberArray[j])) {
					count++;
				}
			}
			if (count==0) {
				System.out.println("Not present");
				
			}
			else {
				System.out.println(count);
				
			}
		}
		
		

	}

}
