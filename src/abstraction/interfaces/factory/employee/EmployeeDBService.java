package abstraction.interfaces.factory.employee;

public class EmployeeDBService implements EmployeeService {

	public void saveEmployee(Employee employee) {
		System.out.println("Saving the employee in Database: " + employee);

	}

	@Override
	public void findEmployee(int id) {
		System.out.println("Employee details of : " + id);
	}

}
