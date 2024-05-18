package abstraction.interfaces.factory;

public class Singleton{
	
	static Singleton singleInstance =null;

	private Singleton() {}
	
	
	public static Singleton getInstance() {
		
		if(singleInstance==null) {
			singleInstance= new Singleton();
					new Singleton();
		}
			
		return singleInstance;
		
	}	

}
