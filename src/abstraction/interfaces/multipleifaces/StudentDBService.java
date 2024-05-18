package abstraction.interfaces.multipleifaces;

public class StudentDBService implements StudentService {

	public void saveStudent(Student student) {
		System.out.println("Saved the student to Database: "+student);
	}

	@Override
	public void getStudentDetails(Student student) {
		System.out.println("Student details : "+student);
		
	}
	
	

}
