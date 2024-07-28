package bank;

public class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(double amount) {
        // Calling super() constructs a new exception with the specified detail message
        super("Insufficient funds exception thrown");
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
