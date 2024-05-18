package controlflow;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int number = scanner.nextInt();// 4
		scanner.close();

		int sum = 0;
		int i = 1;

		while (i <= number) {
			sum += i; // sum = sum + i;
			i++; // i = i +1 // incrementing the loop counter
		}

		System.out.println("Sum of numbers from 1 to " + number + " is: " + sum);

	}

}
