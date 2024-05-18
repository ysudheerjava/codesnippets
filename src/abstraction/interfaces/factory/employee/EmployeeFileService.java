package abstraction.interfaces.factory.employee;

public class EmployeeFileService implements EmployeeService{

	public void saveEmployee(Employee employee) {
	
		System.out.println("Saved the employee in File"+ employee);
	}

	public void findEmployee(int id) {
		System.out.println("Employee details of : "+id);
		
	}
	
	

}
