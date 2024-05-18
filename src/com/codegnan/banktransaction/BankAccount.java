package com.codegnan.banktransaction;

import org.apache.log4j.Logger;

public class BankAccount {
	
	static final Logger logger = Logger.getLogger("bankAccount.class");

	double balance;

	public BankAccount(double initialBalance) {

		this.balance = initialBalance;

	}
	
	public void withDraw(double amount) throws WithdrawalException{
		
		if(amount > balance ) {
		
			logger.error("Insufficient funds for withdrawl, attempted amount: Rs."+amount);
			throw new WithdrawalException("Insufficient funds for Withdrawal", amount);
		}
		
		balance -= amount; // balance = balance - amount;
		logger.info("Withdrawal of Rs"+amount+ "is successful Remaining balance: Rs."+balance);
		
	}
	
	
	
}