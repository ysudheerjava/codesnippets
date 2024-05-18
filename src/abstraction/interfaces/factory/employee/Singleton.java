package abstraction.interfaces.factory.employee;

public class Singleton {
	
	//create a static variable of the type Singleton and assign null
	
	static Singleton singleInstance = null;
	
	//create a private constructor
		private Singleton() {}
	
		
   //create a static method which returns a Single instance 		
	 
		public static Singleton getInstance() 
		{
			if(singleInstance == null) {
			singleInstance = new Singleton();
			}
			return singleInstance; 
		}
  
}
