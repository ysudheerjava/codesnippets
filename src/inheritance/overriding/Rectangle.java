package inheritance.overriding;

public class Rectangle extends Shape {

	private double length;
	private double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	  //override calculateArea() method in Shape
	  public void calculateArea() { 
		  double area = length * width;
		  System.out.println("Area of a rectangle: " + area); }
	 
}
