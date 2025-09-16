package scenario_based;


public class BankAccount {
    
    long accountNumber;
    String accountHolderName;
    double balance;

    
    public BankAccount(long accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited " + amount);
            System.out.println("New Balance: " + this.balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Successfully withdrew " + amount);
            System.out.println("New Balance: " + this.balance);
        } else {
            System.out.println("Withdrawal of " + amount + " failed. Insufficient balance!");
        }
    }

   
    public void displayAccountDetails() {
        System.out.println("--- Account Details ---");
        System.out.println("Account No: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolderName);
        System.out.println("Balance: " + this.balance);
        System.out.println("-----------------------");
    }
}
