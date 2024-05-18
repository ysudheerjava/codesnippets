package inheritance.overriding;

public class TestSalaryCalculator {

	public static void main(String[] args) {
	
		InfosysSalaryCaclculator infy = new InfosysSalaryCaclculator();
		infy.hra=10000;
		infy.allowances=20000;
		infy.basic=30000;
		infy.calculateSalary();
		
		WiproSalaryCalculator wiproemployee = new WiproSalaryCalculator();
		wiproemployee.hra=10000;
		wiproemployee.allowances=40000;
		wiproemployee.basic=30000;
		wiproemployee.calculateSalary();
		
		Accenture accentureemployee = new Accenture();
		accentureemployee.hra=10000;
		accentureemployee.allowances=40000;
		accentureemployee.basic=30000;
		accentureemployee.incentives=5000;
		accentureemployee.calculateSalary();
	}
	
}
