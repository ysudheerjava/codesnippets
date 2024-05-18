package abstraction.interfaces.multipleifaces;

public class StudentApp {
	
	public static void main(String[] args) {
		
		Student student = new Student(100,"Sai");
		
		StudentFileService fileService = new StudentFileService();
		fileService.saveStudent(student);
		
		StudentDBService dbService = new StudentDBService();
		dbService.saveStudent(student);
		
		
		//loosely coupled
		StudentService service= new StudentDBService();
		service.saveStudent(student);
		
		//Get the service object from factory
		StudentService studentService =  StudentServiceFactory.getInstance();
		studentService.saveStudent(student);
		
		
		
		
	
		 
		
	   
		
		
		
		
		
		
		
		
		
		
	}

}
