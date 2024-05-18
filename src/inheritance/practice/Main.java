package inheritance.practice;
// Shape class - superclass
class Shape {
    // Method to calculate the area of the shape
    public void calculateArea() {
        System.out.println("Area calculation not implemented for generic shape.");
    }
}

// Rectangle class - subclass of Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overridden method to calculate the area of the rectangle
    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of rectangle: " + area);
    }
}

// Circle class - subclass of Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overridden method to calculate the area of the circle
    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

// Triangle class - subclass of Shape
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overridden method to calculate the area of the triangle
    @Override
    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of triangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of different shapes
        Shape rectangle = new Rectangle(5, 4);
        Shape circle = new Circle(3);
        Shape triangle = new Triangle(4, 6);

        // Calculating areas
        rectangle.calculateArea(); // Area of rectangle: 20.0
        circle.calculateArea();    // Area of circle: 28.274333882308138
        triangle.calculateArea();  // Area of triangle: 12.0
    }
}
