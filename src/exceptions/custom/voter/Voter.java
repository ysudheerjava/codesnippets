package exceptions.custom.voter;

import org.apache.log4j.Logger;

public class Voter {
	
	String name;
	int age;
	
	
	public Voter(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public void checkEligibility() throws UnderAgeException{
		
		if (age <18) {
			
			throw new UnderAgeException("UnderAgeException: "+name +""
					+ " is not eligible to vote. "
					+ "Age must be greater than or equal to 18 ");
		}
	}
	
public void vote(){
	
	Logger.info(name+ "Successfully voted");
	}

}
