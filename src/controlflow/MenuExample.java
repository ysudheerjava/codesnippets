package controlflow;

import java.util.Scanner;

public class MenuExample {
	public static void main(String[] args) {
		// Scanner for user input
		Scanner scanner = new Scanner(System.in);
		// Prompt user to enter a menu option
		System.out.println("Menu Options:");
		System.out.println("1. View profile");
		System.out.println("2. Edit settings");
		System.out.println("3. Send message");
		System.out.println("4. Logout");
		System.out.println("Enter your choice (1-4):");
		int option = scanner.nextInt();
		// Close the scanner
		scanner.close();
		// Switch statement to handle the menu options
		switch (option) {
		case 1:
			System.out.println("You have selected Option 1: View profile");
			break;
		case 2:
			System.out.println("You have selected Option 2:  Edit settings");
			break;
		case 3:
			System.out.println("You have selected Option 3: Send message");
			break;
		case 4:
			System.out.println("You have selected Option 4: Logout");
			break;
		default:
			System.out.println("Invalid option. Please choose a valid menu option.");
		}
		System.out.println("Thank you, end of the program");
	}
}
