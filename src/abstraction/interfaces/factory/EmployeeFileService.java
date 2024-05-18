package abstraction.interfaces.factory;

public class EmployeeFileService implements EmployeeService{

	@Override
	public Employee findEmployeeById(int id) {
		Employee employee = new Employee(id,"Sudheer");
		return employee;
	}

	@Override
	public boolean saveEmployee(Employee emp) {
		System.out.println("Saving a Employee to File !");
		return true;
	}
	

}
