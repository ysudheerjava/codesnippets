package javatraining;

public class Person {

	int age; // primitive variable
	char gender;
	boolean status;
	
	static String companyName;
	
	//non-static method or instance method
	public void nonStaticMethod() {
		System.out.println(age);
		System.out.println(companyName);
	}

	//static method 
	public static void staticMethod() {
		//System.out.println(age);//C.E: Cannot make a static reference to a non-static field age
		Person p = new Person();
		System.out.println(p.age);
		System.out.println(companyName);

	}

	public static void main(String args[]) {

		Person p = new Person();
		p.age = 10;
		p.gender = 'M';
		companyName = "CodeGnan";
		System.out.println(p.age); // 10
		System.out.println(p.gender);// M
		System.out.println(companyName);// CodeGnan
		System.out.println(p.companyName);// CodeGnan
		System.out.println(Person.companyName);// CodeGnan

		p.companyName = "CGN";

		Person p1 = new Person();
		p1.age = 20;
		p1.gender = 'F';

		System.out.println(p1.age);// 20
		System.out.println(p1.gender);// F
		System.out.println(companyName);// CGN
		System.out.println(p1.companyName);// CGN
		System.out.println(Person.companyName);// CGN

	}

}
