package abstraction.interfaces.factory;

public class Employee {

	int empId;
	String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", getEmpId()=" + getEmpId() + ", getEmpName()="
				+ getEmpName() +"]";
	}
	
	
}
