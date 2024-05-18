package abstraction.interfaces.multipleifaces;

public class Thar implements Car, MediaPlayer {

	public void accelerate(int speed) {
		System.out.println("Accerating at speed of " + speed);
	}

	public void steer(String direction) {
		System.out.println("Steering to " + direction);
	}

	public void brake() {
		System.out.println("Braking the car");
	}

	public void pause() {
		System.out.println("Media Player Paused");
	}

	public void play() {
		System.out.println("Media Player Playing");
	}

	public void off() {
		System.out.println("Player turned off");
	}

}
