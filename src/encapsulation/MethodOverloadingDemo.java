package encapsulation;

public class MethodOverloadingDemo {

	public static void main(String[] args) {

		ArithmeticOperations ao = new ArithmeticOperations();
		
		ao.sum();
		
		ao.sum(20,30);
		
		ao.sum(20,30,50);
		
		
	}

}
