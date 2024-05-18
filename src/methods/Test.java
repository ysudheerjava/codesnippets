package methods;

class Test {

	// method without return type and without arguments
	public void add() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);

	}
	
	
	// a method with formal arguments but no return type
	public void performAddition(int first, int second ) {
		int sum = first + second;
		System.out.println(sum);

	}

	//method with return type 
	public int multiply() {

		int a = 10;
		int b = 20;
		int product = a * b;
		System.out.println(product);
		//return statement is mandatory for a method with return type
		return product;
	}

	// Method with arguments and with return type. 
	public int findProduct(int num1, int num2) {
		int product = num1 * num2;
		return product;
	}
	
	
	public static void main(String[] args) {

		Test t = new Test();
		t.add();

		int i = t.multiply();

		System.out.println(i);

		System.out.println(t.multiply());

		//System.out.println(t.add());
		
		//method call with actual arguments
		t.performAddition(10,20);
		
		//method call to a method with return type and with arguments. 
		int product =t.findProduct(10,20);
		System.out.println(product);

	}
}





