/*demonstrate a string program by using string literal and using new keyword*/
package com.tnsif.stringsprogram;

public class StringSimpleProgram {

	public static void main(String[] args) {
		String str1="shubhangi";
		System.out.println("using string literal:" +str1);
		String str2=new String("shubhangi");
		System.out.println("using string literal:" +str2);
		
		//when the string is create by using new keyword and both the string are same it will create a memory for that string and hemc using == we will get it as different(false)
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		

	}

}
