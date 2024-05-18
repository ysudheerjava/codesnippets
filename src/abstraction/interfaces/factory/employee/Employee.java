package abstraction.interfaces.factory.employee;

public class Employee {

	int id;
	String name;

	// constructor
	// getters and setters
	// toString()

	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {

		String employeeDetails = "Employee ID:" + id + " " + "Name: " + name;
		return employeeDetails;

	}

}
