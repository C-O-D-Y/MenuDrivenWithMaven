package com.Menu.Operations.Methods;

import java.util.Scanner;

public class Fabonacci {

	public static void findFabonacci() {

		/*
		 * In this Method we find the Fabonacci series.
		 * 
		 * @param input takes the input from the user
		 * 
		 * @return Nothing
		 */

		Scanner scanner = new Scanner(System.in);

		// Printing Message

		System.out.print("Enter upto how many numbers of values you want in Fibonacci series");
		int input = scanner.nextInt();

		/*
		 * @param previous is used to store previous values of the series
		 * 
		 * @param next is used to store next value of the series
		 */

		// Assigning Values
		int previous = 0;
		int next = 1;

		// Printing Message

		System.out.print("Your Fibonacci series= ");

		/*
		 * @param index is for incrementing the index
		 * 
		 * @param result is for storing the Result
		 */

		// Assigning Values
		int index = 0;
		int result = 0;
		// Printing Message
		System.out.println("Fabonacci Series of number " + input + " is ");

		/*
		 * In while loop, storing previous summation in result. Giving previous variable
		 * to the next and result value to the next variable
		 */

		while (index < input) {
			System.out.print(previous + " ");
			result = previous + next;
			previous = next;
			next = result;
			index++;
		}
	}

}
