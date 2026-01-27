
public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    // Constructor
    public CheckingAccount(String accountNumber, String accountHolderName, double overdraftLimit) {
        super(accountNumber, accountHolderName);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (getBalance() - amount < -overdraftLimit) {
            System.out.println("Overdraft limit exceeded!");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful (Overdraft used if applicable). Amount: $" + amount);
        }
    }

    // Override abstract method
    @Override
    public String getAccountDetails() {
        return "Checking Account #" + getAccountNumber()
                + ", Balance: $" + String.format("%.2f", getBalance())
                + ", Limit: $" + overdraftLimit;
    }
}
