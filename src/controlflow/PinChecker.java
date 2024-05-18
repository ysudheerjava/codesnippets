package controlflow;
import java.util.Scanner;
public class PinChecker {

	public static void main(String[] args) {

		//Predefined PIN
		
		int predefinedPin = 1234;
		
		//Scanner for user input
		Scanner scanner = new Scanner(System.in);
		 
		//prompt the user to enter a 4 digit PIN
		System.out.println("Enter your 4-digit PIN:");
		int userInput = scanner.nextInt();
		
		//check if the user-entered PIN matches the predefined PIN
		if(userInput == predefinedPin)
			System.out.println("Access granted, Welcome!");
		else
			System.out.println("Access denied, Incorrect Pin, Please try again! ");
		
		scanner.close();
	}

}
