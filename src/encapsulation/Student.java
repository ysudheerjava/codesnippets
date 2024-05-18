package encapsulation;

public class Student {

	private String name;
	private int age;
	private double gpa;

	Student(String name, int age, double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Student(String name) {
		this.name = name;
	}

	Student() {
	}

	// Accessor or getter
	public String getName() {
		return name;
	}

	// mutator or setter
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gpa=" + gpa + "]";
	}

	/*
	 * public String toString() {
	 * 
	 * return "Name: "+name+ " Age: "+age+ " GPA: "+gpa;
	 * 
	 * }
	 */

}
