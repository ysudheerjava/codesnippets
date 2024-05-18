package abstraction.interfaces.factory;

public class EmployeeApp {

	public static void main(String[] args) {

		Employee employee = new Employee(100,"coder");
		
		EmployeeDBService dbService = new EmployeeDBService();
		dbService.saveEmployee(employee);
		
		//Again to save it in file
		
		EmployeeFileService fileService = new EmployeeFileService();
		fileService.saveEmployee(employee);
		
		
		//To make it loosely coupled we have to use interface reference variable
		
		/*
		 * EmployeeService service = new EmployeeDBService();
		 * service.saveEmployee(employee);
		 */
		
		//if you to switch to FileService, use below just change impl class
		
		/*
		 * EmployeeService service = new EmployeeFileService();
		 * service.saveEmployee(employee);
		 */
		
		// The above is loosely coupled
		
		//Now, using factory
		
		EmployeeService service = EmployeeServiceFactory.getInstance();
		service.saveEmployee(employee);
		
		
		
		
	}
}
