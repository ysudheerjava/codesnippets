package inheritance.overriding;

public class Square extends Shape {

	private double side;
	Square(double side) {
		this.side = side;

	}

	public void calculateArea() {
		double area = side * side;
		System.out.println("Area of a Square: " + area);
	}
}
