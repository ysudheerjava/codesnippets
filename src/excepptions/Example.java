package excepptions;

public class Example {

	public static void main(String[] args) {

		try {
		
		int[] numbers = {1,2,3};
		//connection is opened
		//insertions
		//updations
	
		int result = 10/0;
		
		System.out.println(numbers[1]);
	
		}
				
		catch(ArrayIndexOutOfBoundsException ae) {
			//ae.printStackTrace();
			System.out.println("ArrayIndexOutOfBounds Exceptin");
		}
		catch(ArithmeticException ae) {
			//ae.printStackTrace();
			System.out.println("Arithmeticexception occured");
		}
		
		finally {
			
			//close();
			
			System.out.println("Finally block");
		}
		
			
		System.out.println("Main method completed");
				
		
		
	}

}
