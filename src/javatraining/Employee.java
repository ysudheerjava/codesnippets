package javatraining;

public class Employee {
	
	int empId;
	String ename;
	String designation; 
	boolean status;
	
	static String company="CGN";
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.empId=101;
		emp1.ename="Suresh";
		emp1.designation="SE";
			
		Employee emp2 = new Employee();
		emp2.empId=102;
		emp2.ename="Raj";
		emp2.designation="SSE";
		
		System.out.println(emp1.empId);//101
		System.out.println(emp1.ename);//Sueshr
		System.out.println(emp1.designation);//SE
		System.out.println(emp1.company);//CGN
		System.out.println(emp1.status);//
		
		System.out.println("****************************");
		
		System.out.println(emp2.empId);
		System.out.println(emp2.ename);
		System.out.println(emp2.designation);
		System.out.println(emp2.company);
		System.out.println(emp2.status);
		
	    emp1.company="CodeGN";
	    System.out.println(emp1.company);//CodeGN
	    System.out.println(emp2.company);//CodeGN
	    
		

		
		
		
		
	}
	

}
