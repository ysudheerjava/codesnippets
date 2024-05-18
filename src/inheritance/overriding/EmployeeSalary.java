package inheritance.overriding;

public class EmployeeSalary {
	
	int basic;
	int hra;
	int allowances; 
	
	public void getEmployeeSalary() {
		int salary = basic+hra+allowances;
		System.out.println("Gross Salary: "+salary);
	}
	
	public String getEmployeeSalaryPolicy() {
		
		return "Employee Salary Policies";
	}

}
