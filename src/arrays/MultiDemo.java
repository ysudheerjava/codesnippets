package arrays;

public class MultiDemo {

	public static void main(String[] args) {

		// type[][] nameofArray = new type[size][size];

		int[][] multiDimArray = new int[2][2];

		multiDimArray[0][0] = 20;
		multiDimArray[0][1] = 30;
		multiDimArray[1][0] = 60;
		multiDimArray[1][1] = 200;

		for(int row =0; row< 2; row++) {
			
			for(int col =0; col<2; col++) {
				System.out.print(multiDimArray[row][col]);
				System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}

}
