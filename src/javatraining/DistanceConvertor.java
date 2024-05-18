package javatraining;

import java.util.Scanner;

public class DistanceConvertor {

	public static void main(String[] args) {

		// Create a scanner object
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter distance in metres, int value
		System.out.println("Please enter the distance in metres: ");

		// Read the distance in meters as an int
		int distanceInMetres = scanner.nextInt();

		// Convert this distance into Kilometers(double)
		double distanceInKilometers = distanceInMetres / 1000.0;

		// Display the converted distance in Kilometers
		System.out.println("Distance in Kilometers: " + distanceInKilometers + " km");

		// Convert Kilometres to Centimetres as int value, using narrowing
		int distanceInCentimetres = (int) (distanceInKilometers * 100000);
		
		//Display the converted distance in Centimeters
		System.out.println("Distance in Centimeters: " + distanceInCentimetres);

		// close the scanner
		scanner.close();

	}

}
