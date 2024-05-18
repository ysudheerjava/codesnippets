package encapsulation;

public class ProductTest {

	public static void main(String[] args) {

		Product product1 = new Product();
		System.out.println("Details of Product 1:");
		System.out.println(product1.getName());
		System.out.println(product1.getPrice());
		System.out.println(product1.getQuantity());
		System.out.println();
		
		Product product2 = new Product("Laptop",50000.59);
		System.out.println("Details of Product 2:");
		System.out.println(product2.getName());
		System.out.println(product2.getPrice());
		System.out.println(product2.getQuantity());
		System.out.println();
		
		Product product3 = new Product("Tablet",10000.59,2);
		System.out.println("Details of Product 3:");
		System.out.println(product3.getName());
		System.out.println(product3.getPrice());
		System.out.println(product3.getQuantity());
		System.out.println();
		
	}

}
