package abstraction.interfaces.multipleifaces;

public class TharApp {
	
	public static void main(String[] args) {
		
		Thar thar = new Thar();
		
		Car car = thar;
		MediaPlayer player=thar;
		
		car.accelerate(60);
		player.play();
		
		car.steer("Right");
		player.pause();
		car.brake();
		
		car.accelerate(20);
		player.play();
		car.steer("Left");
		
		player.off();
		car.brake();
		
		
		
	}

}
