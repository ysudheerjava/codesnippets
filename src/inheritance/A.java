package inheritance;

public class A {
	
	int x=10;
	String myString ="CodeGnan";
	
	
	public String toString() {
		return "x: "+x+ " myString: "+myString;
	}
	
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
	}

}
