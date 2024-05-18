package controlflow;
import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a character
        System.out.println("Enter a character (R/G/B):");
        String colorcode = scanner.next();

        // Close the scanner
        scanner.close();

        // Switch statement to determine the color based on the user input
        switch(colorcode) {
            case "R":
                System.out.println("RED");
                break;
            case "G":
                System.out.println("GREEN");
                break;
            case "B":
                System.out.println("BLUE");
                break;
            default:
                System.out.println("Choice is out of range");
        }

        // End of the program
        System.out.println("Thank you, end of the program");
    }
}
