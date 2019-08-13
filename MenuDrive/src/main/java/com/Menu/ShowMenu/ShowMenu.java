package com.Menu.ShowMenu;

import java.util.Scanner;
import com.Menu.Operations_Options.*;

public class ShowMenu {
	/**
	 * @author  Saurabh Chauhan
	 * @since   07/25/2019
	 * */
	 	public static void main(String[] args) {
		do
		{
			
			/*
			 * This is Main Method, showing the Menu Option for the User. 
			 * @return Nothing.
			 * */
			
			//Importing Scanner class for taking input.
		Scanner scanner= new Scanner(System.in);
		
		/*
		 * Printing the menu which is giving options for the user
		 */
		
	System.out.println("\n          ************MENU************"
						+ "\n  Please enter one of the option below mentioned"
						+"\n1: Find the next Prime Number"
						+"\n2: Factorial of a number"
						+"\n3: Fabonacci series"
						+"\n4: Calculator process"
						+"\n5: Exit");	
	/*
	 * @param choose: This is parameter used for storing input from the user
	 */
	
	int choose=scanner.nextInt();
	
	/* Calling selecting_Operations method by giving choose variable as parameter in User. 
	 * Method is being called from UserOptions class from com.Menu.Operations_Options Package.
	 */
	
	new UserOptions().selecting_Operations(choose);
	
	//Condition of while loop for executing infinite no. of times until user wanted to end. 
	
		}while(1>0);
	}
}