package encapsulation.task;
class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor 1: Default
    public Product() {
        this.name = "Default Product";
        this.price = 0.0;
        this.quantity = 0;
    }

    // Constructor 2: Name and Price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    // Constructor 3: All parameters
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to display product details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances using different constructors
        Product product1 = new Product();
        Product product2 = new Product("Laptop", 999.99);
        Product product3 = new Product("Phone", 499.99, 5);

        // Displaying details of each product
        System.out.println("Product 1:");
        product1.display();

        System.out.println("Product 2:");
        product2.display();

        System.out.println("Product 3:");
        product3.display();

        // Modifying details of product 1 using setter methods
        product1.setName("Tablet");
        product1.setPrice(299.99);
        product1.setQuantity(3);

        // Displaying modified product details
        System.out.println("Modified Product:");
        product1.display();
    }
}
