package com.Menu.Operations.Methods;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void findFactorial() {

		/*
		 * In this Method we find the factorial of a given number.
		 * 
		 * @param input takes the input from the user
		 * 
		 * @return Nothing
		 */

		// Declaring variable.

		int input;
		BigInteger factorial = new BigInteger("1");
		Scanner scanner = new Scanner(System.in);
		// Printing Message
		System.out.print("Enter the number for finding the factorial: ");
		input = scanner.nextInt();

		/*
		 * "for" loop multiply the input from index incrementing the index until
		 * index=input
		 */

		for (int index = 1; index <= input; index++) {
			factorial = factorial.multiply(new BigInteger(index + ""));
		}
		// Printing Result

		System.out.println("Factorial of number " + input + "is " + factorial);
	}
}