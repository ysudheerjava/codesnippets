package abstraction.interfaces.multipleifaces;

public class TestSingleton {
	
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1==s2)
			System.out.println("Same objects");
		else
			System.out.println("Different objects");
	}

}
