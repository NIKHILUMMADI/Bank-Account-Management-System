import java.util.ArrayList;

public class BankManager {

    public static void main(String[] args) {

        // Polymorphism: Parent reference
        ArrayList<BankAccount> accounts = new ArrayList<>();

        // Create accounts
        SavingsAccount savings = new SavingsAccount("12345", "Sreenadh", 0.02);
        CheckingAccount checking = new CheckingAccount("67890", "Sreenadh", 500.00);

        // Add to list
        accounts.add(savings);
        accounts.add(checking);

        // Initial details
        System.out.println("---- Initial Account Details ----");
        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountDetails());
        }

        // Transactions
        System.out.println("\n---- Transactions ----");
        savings.deposit(200);
        checking.withdraw(100);

        // Apply interest (casting)
        if (savings instanceof SavingsAccount) {
            savings.applyInterest();
        }

        // Final details
        System.out.println("\n---- Final Account Details ----");
        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountDetails());
        }
    }
}
