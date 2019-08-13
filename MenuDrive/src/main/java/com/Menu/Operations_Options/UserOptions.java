package com.Menu.Operations_Options;

import com.Menu.Operations.Methods.Fabonacci;
import com.Menu.Operations.Methods.Factorial;
import com.Menu.Operations.Methods.NextPrime;
/*
 * Importing the input package from the project calculator2.
 * Having dependency on the calculator2 project in this project
 */
import calculator.solution.Input;

public class UserOptions {
	public void selecting_Operations(int getChoice) {
		/*
		 * In this Method, Program take input of user choice and select the case
		 * accordingly
		 * 
		 * @return Nothing
		 */

		// Using switch case, choosing particular method.

		switch (getChoice) {

		// case 1 is used for finding next Prime

		case 1:
			NextPrime.findNextPrime();
			break;

		// case 1 is used for finding next Prime

		case 2:
			Factorial.findFactorial();
			break;

		// case 2 is used for finding Factorial of a given number.

		case 3:
			Fabonacci.findFabonacci();
			break;

		// case 3 is used for finding Fabonacci series

		case 4:
			System.out.println("welcome to Calculator process");
			new Input();

			// default case is giving message given in the body when wrong option is
			// choosen.
		case 5:
			System.out.println("Thank You");
			System.exit(0);
			break;

		default:
			// Printing Message for choosing correct message.
			System.out.println("Please Choose correct Option");
		}
	}
}
