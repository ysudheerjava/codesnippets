package encapsulation.copyconstructor;

public class TestCopy {

	public static void main(String[] args) {

		Car car1 = new Car("Honda","City",2024,"Sedan","Automatic");
		System.out.println(car1);
		
		//Using copy constructor to copy existing car object details
		Car car2 = new Car(car1);
		System.out.println(car2);
		
	}

}
