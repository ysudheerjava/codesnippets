package encapsulation.practice;

public class TestProduct {

	public static void main(String[] args) {

		//Using a constructor with no arguments 
		Product product1 = new Product();
		System.out.println("Product1 details: ");
		System.out.println(product1);
		System.out.println();
		
		//Using a constructor with 2 arguments 
		Product product2 = new Product("Laptop", 45000.44);
		product2.setQuantity(1);
		System.out.println("Product2 details: ");
		System.out.println(product2);
		
		//Using a constructor with 3 arguments
		Product product3 = new Product("Phone", 499,5);
		System.out.println("Product3 details: ");
		System.out.println(product3);
		
	}

}
