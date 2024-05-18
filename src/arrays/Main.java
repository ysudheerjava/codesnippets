package arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for array size
        System.out.print("Enter the size of the fruits array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create the array
        String[] fruitsArray = new String[size];

        // Take input for each fruit and insert into the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter fruit #" + (i + 1) + ": ");
            fruitsArray[i] = scanner.nextLine();
        }

        // Display the list of fruits
        System.out.println("List of fruits:");
        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }

        scanner.close();
    }
}
