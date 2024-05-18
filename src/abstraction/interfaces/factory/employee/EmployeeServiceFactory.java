package abstraction.interfaces.factory.employee;

public class EmployeeServiceFactory {

	// We must not have multiple instance of Factory, we must create a static
	// method to request an instance from factor.

	public static EmployeeService getInstance() {
		EmployeeService service = new EmployeeDBService();
		return service;

	}

}
