package methods;

public class ArrayModifier {

	// method with int array return type and with int array arguments
	public int[] doubleArrayValues(int[] array) {

		int[] doubledArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			doubledArray[i] = array[i] * 2; // Doubling each element of the array
		}
		return doubledArray; // Returning the modified array__
	}

	public static void main(String[] args) {
		ArrayModifier modifier = new ArrayModifier();
		int[] originalArray = { 1, 2, 3, 4, 5 }; // Original array
		int[] doubledArray = modifier.doubleArrayValues(originalArray); // Method call passing an array
		System.out.println("Original Array:");
		for (int num : originalArray) {
			System.out.print(num + " ");
		}
		System.out.println("\nDoubled Array:");
		for (int num : doubledArray) {
			System.out.print(num + " ");
		}
	}
}
