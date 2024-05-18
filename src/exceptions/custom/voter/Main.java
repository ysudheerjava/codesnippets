package exceptions.custom.voter;

import org.apache.log4j.Logger;

public class Main {
	
	static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		Voter voter1 = new Voter("Raj",19);
		Voter voter2 = new Voter("Rose",17);
		
		
		try {
		voter1.checkEligibility();
		voter1.vote();
		}catch(UnderAgeException u) {
			logger.error("UnderAge "+u.getMessage());
		}
		
		
		try {
			voter2.checkEligibility();
			}catch(UnderAgeException u) {
				logger.error("UnderAge "+u.getMessage());
			}
		
	}

}
