package encapsulation.copyconstructor;

public class Fruit {

	private String name;
	private String color;

	
	/*
	 * //Constructor to initialize Fruit object Fruit(String name, String color){
	 * 
	 * this.name=name; this.color=color; }
	 * 
	 * //copy constsructor Fruit(Fruit otherFruit){ this.name= otherFruit.name;
	 * this.color=otherFruit.color; }
	 */
	
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
			return "Fruit Name: "+name+", Fruit Color:"+color;
	}
	

}
