package methods;

public class Demo {

	// method without arguments and without returntype
	public void add() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("Sum: " + sum);
	}

	public int addNumbers() {
		int a = 10;
		int b = 20;
		int sum = a + b;

		return sum;

	}

	public String sayHello() {
		String myString = "Hello";
		return myString;
	}

	public int displayNum() {

		return 100;
	}

	public static void multiply() {

		int a = 10;
		int b = 20;
		int product = a * b;
		System.out.println(product);
	}

	// method with formal arguments
	public int calculateTotal(int mark1, int mark2, int mark3) {
		int total_marks = mark1 + mark2 + mark3;
		// System.out.println("Total Marks: "+total_marks );
		return total_marks;

	}

	public Student getStudentDetails() {

		Student student = new Student();
		student.rollNo = 200;
		student.name = "Raj";
		return student;

	}

	public static void main(String[] args) {

		Demo d = new Demo();
		Student student= d.getStudentDetails();
		System.out.println(student.name);
		System.out.println(student.rollNo);

	}

}
