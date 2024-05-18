package arrays;

public class ArrayIntro {

	public static void main(String[] args) {

		String fruit1 = "Banana";
		String fruit2 = "Mango";
		String fruit3 = "Grapes";

		String[] fruitsArray = new String[4];
		fruitsArray[0] = "Banana";
		fruitsArray[1] = "Mango";
		fruitsArray[2] = "Guava";
		fruitsArray[3] = "Kiwi";

		System.out.println(fruitsArray[0]);
		System.out.println(fruitsArray[1]);

		System.out.println(fruitsArray[2]);

		System.out.println(fruitsArray[3]);

		// length
		System.out.println(fruitsArray.length);

		System.out.println("**Inline Array**");
		// inline initialization of Array

		String[] fruitsArray1 = { "Apricot", "Kiwi", "Banana", "Apple", "Guava" };
		/*
		 * System.out.println(fruitsArray1[0]); System.out.println(fruitsArray1[1]);
		 * System.out.println(fruitsArray1[2]);
		 * 
		 * System.out.println(fruitsArray1.length);
		 */

		for (int i = 0; i < fruitsArray1.length; i++)
			System.out.println(fruitsArray1[i]);
		// Enhanced For loop
		// for ( elementtype element : arrayname)
		System.out.println("***Using enhanced for loop***");
		for (String fruit : fruitsArray1)
			System.out.println(fruit);

	}

}
