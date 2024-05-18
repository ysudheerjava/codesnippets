package arrays;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//prompt the user to enter the size of the array
		System.out.println("Enter number of elements:");
		int arraySize = scanner.nextInt();
		
		//Declare and define the array with user provided size
		int[] ar = new int[arraySize];
		
		//prompt the user to enter each element of the array
		System.out.println("Enter the values for each element of arrray");
		for (int c = 0; c < ar.length; c++)
			ar[c] = scanner.nextInt();

		//Display the array elements
		System.out.println("Displaying Array elements");
		for (int c = 0; c < ar.length; c++)
			System.out.println(ar[c]);
		
		//Enhanced for loop
		//Syntax: for( elementtype element : arrayname)
		System.out.println("Using Enhanced for loop");
		for(int element :ar)
			System.out.println(element);

	}

}
