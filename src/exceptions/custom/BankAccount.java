package exceptions.custom;

import org.apache.log4j.Logger;

// Example bank account class
class BankAccount {
    private static final Logger logger = Logger.getLogger(BankAccount.class);

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws WithdrawalException {
        if (amount > balance) {
            logger.error("Insufficient funds for withdrawal. Attempted amount: $" + amount);
            throw new WithdrawalException("Insufficient funds for withdrawal", amount);
        }
        balance -= amount;
        logger.info("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance);
    }
}
