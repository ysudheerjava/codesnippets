package inheritance.practice;

public class Test {

	public static void main(String[] args) {

		Engine engine = new Engine();
		Car car = new Car(engine);
		car.startCar();
		car=null;
		car.startCar();
		engine.startEngine();
		/*car= null;
		//car.startCar();
		*/
	}

}
