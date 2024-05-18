package exceptions.custom;
// Custom checked exception class for withdrawal operation
class WithdrawalException extends Exception {
    private double amount;

    public WithdrawalException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}