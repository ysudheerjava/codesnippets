package abstraction.interfaces.multipleifaces;

public class StudentFileService implements StudentService {

	public void saveStudent(Student student) {
		System.out.println("Saved the student to file: "+student);
	}

	@Override
	public void getStudentDetails(Student student) {
		System.out.println("Student details : "+student);
		
	}
	
	

}
