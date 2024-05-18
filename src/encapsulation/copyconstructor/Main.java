package encapsulation.copyconstructor;
class Point {
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Method to display point coordinates
    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a point
        Point point1 = new Point(3, 5);

        // Using copy constructor to create another point
        Point point2 = new Point(point1);

        // Displaying both points
        System.out.print("Point 1: ");
        point1.display();

        System.out.print("Point 2: ");
        point2.display();
    }
}
