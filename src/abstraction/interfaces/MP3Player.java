package abstraction.interfaces;

public class MP3Player implements AudioPlayer {

	public void play() {
		System.out.println("Playing MP3Player music");
	}
	
	public void pause() {
		System.out.println("Pausing MP3Player music");
	}
	
	public void stop() {
		System.out.println("Stopping MP3Player music");
	}
	
}
