package exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Calculating the Quotient:");
		int firstNum, secondNum;
		firstNum = 100;
		secondNum = 0;
		int quotient = 0;
		quotient = firstNum / secondNum;
		
		/*
		 * try { quotient = firstNum / secondNum;// risky code 3 }catch (Exception e) {
		 * System.out.println("Error: Integer Division by zero is prohibited"); }
		 */
		System.out.println("quotient calculated");
		System.out.println("Quotient: " + quotient);

	}

}
