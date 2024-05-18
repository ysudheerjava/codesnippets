package abstraction.interfaces.factory;

public interface EmployeeService {

	public Employee findEmployeeById(int id);

	public boolean saveEmployee(Employee emp);

}
