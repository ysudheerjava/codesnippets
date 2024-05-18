package javatraining;

public class TemperatureExample {
	public static void main(String[] args) {
		double averageTemperature = 23.567; // Average temperature 
		// Now, let's convert the average temperature to an integer value 
		
		int roundedTemperature = (int) averageTemperature; // Narrowing casting from double to int
		
		// Output the result
		System.out.println("Average temperature: " + roundedTemperature);
	}
}
