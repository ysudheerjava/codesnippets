package methods;



public class CustomerTest {

	public Customer getCustomerDetails(int id, String custName) {
		Customer customer = new Customer();
		customer.customerId = id;
		customer.name = custName;
		return customer;
	}

	public static void main(String[] args) {
		
		CustomerTest ct = new CustomerTest();
		Customer customer = ct.getCustomerDetails(100, "Kumar");
		System.out.println(customer.customerId);
		System.out.println(customer.name);
		

	}

}
