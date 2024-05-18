package abstraction.interfaces.multipleifaces;

public class StudentServiceFactory {
	
	public static StudentService getInstance(){
		   
		  StudentService service = new StudentDBService(); 
		  return service;
	   }

}
