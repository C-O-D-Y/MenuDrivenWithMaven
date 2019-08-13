package com.Menu.Operations.Methods;

import java.util.Scanner;

public class NextPrime {
	/*
	 * In this method we find the next prime of the given number.
	 * 
	 * @return Nothing
	 */
	public static void findNextPrime() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number to find next prime");

		int input = scanner.nextInt();

		// by using while loop we divide the number until loop breaks.

		while (1 > 0) {
			input++;
			int check = 0;

			// in for loop we check the condition of input. 
			// and, accordingly use if or else statements.

			for (int index = 2; index <= input / 2; index++) {
				if (input % index == 0) {
					// Assigning Values
					check = 1;
					break;
				}
			}
			if (check == 0) {
				// Printing Result
				System.out.println("the next prime number is= " + input);
				break;
			}
		}
	}
}
