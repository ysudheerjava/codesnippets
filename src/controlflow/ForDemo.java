package controlflow;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number : ");
		int number = sc.nextInt();

		// print the numbers in increasing order
		System.out.println("Printing in ascending order");
		for (int i = 1; i <= number; i++) {

			System.out.println(i);
		}
		
		System.out.println("Printing in descending order");

		// printing the numbers in reverse order
		for (int i = number; i >= 1; i--) {

			System.out.println(i);
		}

	}

}
