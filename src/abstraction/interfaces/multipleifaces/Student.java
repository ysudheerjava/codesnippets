package abstraction.interfaces.multipleifaces;

public class Student {

	int studentId;
	String name;

	Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}


}
