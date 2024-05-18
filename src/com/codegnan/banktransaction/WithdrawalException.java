package com.codegnan.banktransaction;

public class WithdrawalException extends Exception {
	
	private double amount;
	
	WithdrawalException(String message, double amount){
			super(message);
			this.amount= amount;
	}
	
	
	public double getAmount() {
		
		return amount;
	}
	

}
