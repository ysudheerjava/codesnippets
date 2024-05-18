package arrays;

import java.util.Scanner;

public class ArrayDemo4 {
	public static void main(String[] ra) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of 1d : ");
		int a = sc.nextInt();
		int[][] ar;
		ar = new int[a][];
		for (int c = 0; c < a; c++)
			ar[c] = new int[(c * 2) + 1];
		// Input
		System.out.println("Enter array elements : ");
		for (int c = 0; c < ar.length; c++)
			for (int d = 0; d < ar[c].length; d++)
				ar[c][d] = sc.nextInt();

		// Process

		System.out.println("Array elements are : ");
		// Output
		for (int c = 0; c < ar.length; c++) {
			for (int d = 0; d < ar[c].length; d++)
				System.out.print(ar[c][d] + " ");
			System.out.println();
		}
	}
}
