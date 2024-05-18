package excepptions;
public class NestedTryExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block started.");
            
            try {
                // Inner try block
                System.out.println("Inner try block started.");
                
                int[] numbers = {1, 2, 3};
                System.out.println("Element at index 5: " + numbers[5]); // This will throw ArrayIndexOutOfBoundsException
                
                System.out.println("This line won't be executed."); // This line won't be reached
            } catch (ArrayIndexOutOfBoundsException e) {
                // Inner catch block
                System.out.println("Inner catch block: Array index out of bounds: " + e.getMessage());
            }
            
            System.out.println("This line is after the inner try-catch block."); // This line will be reached
            
        } catch (Exception e) {
            // Outer catch block
            System.out.println("Outer catch block: An unexpected exception occurred: " + e.getMessage());
        }
        
        System.out.println("End of the program."); // This line will be reached
    }
}
