package abstraction.interfaces.factory;

public class EmployeeDBService implements EmployeeService{

	public Employee findEmployeeById(int id) {
		Employee employee = new Employee(id,"Sudheer");
		return employee;
	}

	public boolean saveEmployee(Employee emp) {
		System.out.println("Saving a Employee to DB!");
		return true;
	}
	

}
