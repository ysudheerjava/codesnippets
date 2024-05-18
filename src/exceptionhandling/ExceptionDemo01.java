package exceptionhandling;

public class ExceptionDemo01 {

	public static void main(String[] args) {

		int num1, num2;
		num1 = 10;
		num2 = 0;
		System.out.println("Quotient calculation...");
		int quotient = 0;
		  try { 
			  quotient = num1 / num2; // risky code 
		  } catch (Exception e) {
		  System.out.println("Dividing the number with zero"); 
		  }
		 
		System.out.println("Quotient calculated");
		System.out.println("Quotient: " + quotient);

	}

}
