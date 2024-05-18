package inheritance.overriding;

public class Google extends EmployeeSalary{
	
	int incentives;
	
	public void getEmployeeSalary() {
		int salary = basic+hra+allowances+incentives;
	}

}
