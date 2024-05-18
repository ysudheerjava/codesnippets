package inheritance.overriding;

public class Triangle extends Shape {

	private double base;
	private double height;

	Triangle(double base, double height) {
		this.base = base;
		this.height=height;

	}

	public void calculateArea() {
		double area = 0.5*base*height;
		System.out.println("Area of a Triangle: " + area);
	}

}
