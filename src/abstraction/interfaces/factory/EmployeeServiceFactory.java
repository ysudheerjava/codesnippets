package abstraction.interfaces.factory;

public class EmployeeServiceFactory{
	
	
	//we should not have multiple instance of factory, if we create non static, 
	//each time we request a factory a new instance will be created, so we just make it a static
	
	public static EmployeeService getInstance() {
		
		EmployeeService service = new EmployeeDBService();
		return service;
		
	}
	
	
	

}
