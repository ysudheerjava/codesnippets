package excepptions;

public class Demo01 {

	public void doMoreStuff() throws ArithmeticException, ArrayIndexOutOfBoundsException{
		System.out.println("doMoreStuff started..");
		int result = 10/0;
		System.out.println("doMoreStuff() completed");
	}

	public void doStuff() {
		System.out.println("doStuff() statted");
		try {
		doMoreStuff();
		}catch(ArithmeticException ae) {
			System.out.println("In catch block of doStuff()");		
		}
		
		System.out.println("doStuff() completed");
	}

	public static void main(String[] args) {
		System.out.println("main() method started");
		Demo01 demo = new Demo01();
		demo.doStuff();
		System.out.println("main() completed");
		

	}

}
