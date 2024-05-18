package abstraction.interfacetask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Shape shape=null;
        System.out.println("Enter the name of the shape(Triangle/Square)");
        String shapeName = scanner.next();
        if (shapeName.equalsIgnoreCase("triangle")) {
            //shape = new Triangle();
        } else if (shapeName.equalsIgnoreCase("square")) {
            shape = new Square();
        } else {
            System.out.println("Invalid shape name");
            return;
        }
        shape.getNoOfSides();
        scanner.close(); // Closing the scanner after use
    }
}
