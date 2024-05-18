package inheritance.overriding;

public class Test {
	
	public static void main(String[] args) {
		InfosysSalary infySal = new InfosysSalary();

		infySal.basic = 10000;
		infySal.allowances = 5000;
		infySal.hra = 1000;

		infySal.getEmployeeSalary();
		infySal.getEmployeeSalaryPolicy();

		CodeGnanSalary cgnSal = new CodeGnanSalary();

		cgnSal.basic = 20000;
		cgnSal.allowances = 6000;
		cgnSal.hra = 1000;

		cgnSal.getEmployeeSalary();
		cgnSal.getEmployeeSalaryPolicy();
		
		Google google = new Google();
		google.basic=10000;
		google.hra=8000;
		google.allowances=15000;
		google.incentives= 30000;
	
		google.getEmployeeSalary();
		google.getEmployeeSalaryPolicy();
		
		
	}

}
