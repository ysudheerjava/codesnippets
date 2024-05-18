package encapsulation.copyconstructor;

public class Apple extends Fruit{

	private String appleType;

	/**
	 * @return the appleType
	 */
	public String getAppleType() {
		return appleType;
	}

	/**
	 * @param appleType the appleType to set
	 */
	public void setAppleType(String appleType) {
		this.appleType = appleType;
	}
	
	public String toString() {
		
		return "Name: "+getName() +" Color: "+getColor() +" Type: "+getAppleType();
	}
	
	
	
 
}
