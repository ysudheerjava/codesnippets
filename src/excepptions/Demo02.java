package excepptions;

public class Demo02 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 6 };

		try {

			if (numbers.length > 6) {
				System.out.println(numbers[5]);
			} else {
				int result = 10 / 0;
			}
			System.out.println("Done with try block");

		}

		catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occured:" + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Array index out of bounds: " + a.getMessage());
		}

		catch (Exception e) {
			System.out.println("Exception occured.");
		}

		finally {

			System.out.println("In finally block");
		}
		System.out.println("Main method completed");

	}

}
