package abstraction.interfaces.factory;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//constructor is not visible
		//Singleton singleton = new Singleton();
		
		Singleton singleton1 = Singleton.getInstance();
		
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton1==singleton2);


	}

}
