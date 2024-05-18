package controlflow;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user which table they want
        System.out.print("Enter the number for which you want the multiplication table: ");
        int number = scanner.nextInt();
        
        // Print the multiplication table
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
        
        scanner.close();
    }
}
