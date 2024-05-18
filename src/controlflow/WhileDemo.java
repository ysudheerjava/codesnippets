package controlflow;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number upto which you want to check for even or odd:");
		int maxNumber = scanner.nextInt();

		int number = 1;
		while (number <= maxNumber) {
			if (number % 2 == 0)
				System.out.println(number + " is even");
			else
				System.out.println(number + " is Odd");
			number++;

		}
		scanner.close();
	}

}
