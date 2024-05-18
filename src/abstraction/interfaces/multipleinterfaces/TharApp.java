package abstraction.interfaces.multipleinterfaces;

public class TharApp {

	public static void main(String[] args) {

		Thar t = new Thar();
		//Reference variable can be created for Intereface, it can hold the object ref of implementing class. 
		Car c = t;
		//Car c2 = new Thar();
		
		MediaPlayer m = t;
		//MediaPlayer m1 = new Thar();
		
		c.accelerate(50);
		m.play();
		m.pause();
		c.steer("Left");
		m.play();
		c.accelerate(20);
		c.steer("Right");
		c.stop();
		m.off();

	}

}
