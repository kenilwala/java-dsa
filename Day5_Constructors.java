public class Day5_Constructors {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor to initialize the object
    public Day5_Constructors(String holder, String accNum, double initialDeposit) {
        accountHolder = holder;
        accountNumber = accNum;
        balance = initialDeposit;
    }

    // Method to display account info
    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}

