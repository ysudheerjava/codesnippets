package inheritance.overriding;

public class SalaryCalculator {
	
	int basic;
	int hra;
	int allowances; 
	
	
	public void calculateSalary() {
	  int salary = basic+hra+allowances; 
	  System.out.println("Gross salary: "+salary);
	}
	
	public String getSalaryPolicy() {
		return "Standard company salary policies";
	}

}
