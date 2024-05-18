package inheritance.overriding;

public class Main {

	public static void main(String[] args) {

		Rectangle  rectangle = new Rectangle(30,20);
		rectangle.calculateArea();
		
		Square square = new Square(20);
		square.calculateArea();
		
        Triangle triangle = new Triangle(20,25);
        triangle.calculateArea();
	}
	
	

}
