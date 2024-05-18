package encapsulation;

public class TestOverloading {
	
	public static void main(String[] args) {
		
		Addition addition = new Addition();
		//calling a method without args
		addition.sum();
		
		//calling a method with 2 arguments
		addition.sum(10,30);
		
		//calling a method with 3 arguments
		addition.sum(10,30,50);
		
		addition.sum(10,30,"CodeGnan");
		
	}
	
	
}
