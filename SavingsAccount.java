public class SavingsAccount extends BankAccount {

    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolderName, double interestRate) {
        super(accountNumber, accountHolderName);
        this.interestRate = interestRate;
    }

    // Apply interest
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
        System.out.println("Interest applied: $" + interest);
    }

    // Override abstract method
    @Override
    public String getAccountDetails() {
        return "Savings Account #" + getAccountNumber()
                + ", Balance: $" + String.format("%.2f", getBalance())
                + ", Rate: " + (interestRate * 100) + "%";
    }
}
