package abstraction.interfaces.multipleifaces;

public class Singleton {
	
	static Singleton singleInstance =null;
	
	private Singleton() {}
	

	public static Singleton getInstance() {
		
		if(singleInstance== null) {
		singleInstance= new Singleton();
		}
		
		return singleInstance;
	}
	
}
