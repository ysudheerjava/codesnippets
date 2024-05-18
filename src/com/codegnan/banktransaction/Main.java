package com.codegnan.banktransaction;

import org.apache.log4j.Logger;

public class Main {
	
	static final Logger logger = Logger.getLogger("Main.class");

	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(1000);
		
		try {
		account.withDraw(1500);
		}catch(WithdrawalException e) {
		    logger.error("Caught WithdrawalException:" + e.getMessage());
			logger.error("Attempted to withdraw Rs."+e.getAmount());
		}
		
		
	}

}
