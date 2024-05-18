package abstraction.interfaces.factory.employee;

public class EmployeeApp {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee(100, "Coder");
		
		EmployeeDBService dbService = new EmployeeDBService();
		dbService.saveEmployee(employee);
		
		EmployeeFileService fileService = new EmployeeFileService();
		fileService.saveEmployee(employee);
		
		//loosely coupled - use interface reference variable
		
		EmployeeService service = new EmployeeFileService();
		service.saveEmployee(employee);
		
		//Get the Service instance from factory
		EmployeeService empService = EmployeeServiceFactory.getInstance();
		empService.saveEmployee(employee);

		
		
		
	}

}
