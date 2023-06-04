//program to demonstrate on throw and throws keyword
package com.tnsif.exceptionhandling;
import java.io.IOException;

public class ThrowKeywordExample {

	public static void donate(int age, int weight) throws IOException {
		if(age>18 && weight>50)
			System.out.println("Eligible to vote");
		else
			/*throw keyword is used to throw an exception explicitly*/
			throw new IOException("Not elgible");
	}
	public static void main(String[] args) {
		try {
			ThrowKeywordExample.donate(17, 56);
		} catch (IOException e) {
			System.out.println("Exception handled "+e);
		}

	}

}
