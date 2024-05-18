package methods;
public class ArrayExample {
   
	//method which returns an array
	public int[] generateArray(int size) {
        
		int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1; // Filling the array with values
        }
        return arr; // Returning the array
    }

    public static void main(String[] args) {
       
    	ArrayExample example = new ArrayExample();
        
        int[] resultArray = example.generateArray(5); // Method call returning an array
        System.out.println("Generated Array:");
        
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }
}
