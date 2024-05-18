package isahasa;
public class Person {
    private String name;
    private Address address; // Aggregation

    // Constructor, getters, and setters

    public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");

        // Address can be null
        person.setAddress(null);

        // Address can be assigned
        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("Anytown");
        address.setZipCode("12345");
        person.setAddress(address);
    }
}
