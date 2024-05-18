package exceptions.custom;

import org.apache.log4j.Logger;




// Main class to demonstrate usage
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
     

        BankAccount account = new BankAccount(1000);

        try {
            // Attempting to withdraw an amount greater than the balance
            account.withdraw(1500);
        } catch (WithdrawalException e) {
            // Handling the custom exception
            logger.error("Caught WithdrawalException: " + e.getMessage());
            logger.error("Attempted withdrawal amount: Rs. " + e.getAmount());
            // Perform additional error handling or logging here
        }
    }
}
