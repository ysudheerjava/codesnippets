package arrays;

public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {

		// Multidimensional array - array of an array
		int[][] matrix = new int[2][2];

		// row0
		matrix[0][0] = 11; // row0,col0
		matrix[0][1] = 12; // row 0 , col1
		matrix[1][0] = 22;
		matrix[1][1] = 32; // row1, col1;

		for (int row = 0; row < 2; row++) { // rows

			for (int col = 0; col < 2; col++) {
				System.out.print(matrix[row][col]);
				System.out.print(" ");
			}
			
          System.out.println();
		}

	}

}
