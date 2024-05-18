package exceptionhandling;

public class ExceptionDemo02 {

	public static void main(String[] args) {

		int[] intArray = { 10, 30, 50 };
		System.out.println("Accessing array elements");
		System.out.println(intArray[3]);//risky code
		System.out.println("Program ended");

	}

}
