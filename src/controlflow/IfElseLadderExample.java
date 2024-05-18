package controlflow;

import java.util.Scanner;

public class IfElseLadderExample {
	public static void main(String[] args) {
		// Define values for comparison
		int val1 = 10;
		int val2 = 20;
		int val3 = 30;
		// Scanner for user input
		Scanner scanner = new Scanner(System.in);
		// Prompt user to enter a value for var
		System.out.println("Enter a value for userInput:");
		int userInput = scanner.nextInt();
		// Check the value of var using if-else ladder
		if (userInput == val1) 
			System.out.println("userInput is equal to val1.");
			//System.out.println();
		 else 
			 if (userInput == val2)
			System.out.println("userInput is equal to val2.");
		else 
			if (userInput == val3)
			System.out.println("userInput is equal to val3.");
		else
			System.out.println("User Input does not match any predefined values.");

		// Close the scanner
		scanner.close();
	}
}
