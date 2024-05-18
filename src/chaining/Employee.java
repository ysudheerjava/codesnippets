package chaining;

public class Employee {

	int id;
	String name;
	 double salary=3000;

	Employee() {
	}

	Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	Employee(int id, String name) {

		this.id = id;
		this.name = name;

	}

	Employee(int id) {

		this.id = id;
	}
	
	
	public final void doSomething() {
		salary=200;
	}

}
