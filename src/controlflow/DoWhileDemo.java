package controlflow;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {

		int number = 12;

		do {
			System.out.println(number);
			number++;
		} while (number <= 10);

		System.out.println("End of the program");
	}

}
