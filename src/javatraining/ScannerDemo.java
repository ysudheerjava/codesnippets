package javatraining;
import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
	
		//Create  a scanner object to read input from the console
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter a String
		System.out.print("Enter a String: "); 
		
		//Read the String entered by the user
		String inputString = scanner.nextLine();
		
		//Display the String entered by the user
		System.out.println("You entered: "+inputString);
		
		//close the Scanner object to release the System resources
		scanner.close();
	}

}
