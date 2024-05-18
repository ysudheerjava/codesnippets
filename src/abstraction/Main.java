package abstraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the shape");
		String shapeInput = scanner.next();
		scanner.close();
		
		Shape shape;

		if (shapeInput.equalsIgnoreCase("triangle")) {
			shape = new Triangle();
		}
		else if (shapeInput.equalsIgnoreCase("Square")) {
			shape = new Square();
		}
		
		else if (shapeInput.equalsIgnoreCase("rectangle")) {
			shape = new Square();
		}
		else {
			System.out.println("Invalid shape");
		return;		
		}
		shape.getNumberOfSides();
		

	}

}
