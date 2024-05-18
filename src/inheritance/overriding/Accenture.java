package inheritance.overriding;

public class Accenture extends SalaryCalculator{
	
	int incentives;
	
		public void calculateSalary() {
		  int salary = basic+hra+allowances+incentives; 
		  System.out.println("Gross salary: "+salary);
		}

}
