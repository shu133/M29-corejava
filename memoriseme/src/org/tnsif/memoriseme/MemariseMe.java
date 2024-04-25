package org.tnsif.memoriseme;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemariseMe {

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);

		// Input the number of elements in the array
		System.out.println("Enter the number of elements in the array:");
		int n = scanner.nextInt();

		// Input the elements of the array
		int[] numbers = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		// Input the number of queries
		System.out.println("Enter the number of queries:");
		int q = scanner.nextInt();

		// Input the queries and count occurrences
		System.out.println("Enter the queries:");
		Map<Integer, Integer> freqMap = new HashMap<>();
		for (int i = 0; i < q; i++) {
			int query = scanner.nextInt();
			int count = 0;
			for (int number : numbers) {
				if (number == query) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Total occurrences of " + query + ": " + count);
			} else {
				System.out.println("This query is NOT PRESENT");
			}
		}

		scanner.close();
	}

}
