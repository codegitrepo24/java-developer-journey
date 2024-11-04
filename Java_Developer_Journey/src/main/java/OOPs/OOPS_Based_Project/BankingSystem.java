package main.java.OOPs.OOPS_Based_Project;

// Abstract class to demonstrate Abstraction
abstract class Account{
    private String accountHolder; // Encapsulated field
    private double balance; // Encapsulated field

    // Constructor to initialize account details
    public Account(String accountHolder, double initialBalance){
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Getter method to access account balance (Encapsulation)
    public double getBalance(){
        return balance;
    }

    // Method to deposit money (common to all accounts)
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        }
        else{
            System.out.println("Invalid deposite amount.");
        }
    }

    // Abstract method for withdrawal (Polymorphism)
    public abstract void withdraw(double amount); 

    public void displayInfo(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Balance: " + balance);
    }
}

// SavingsAccount class inherits from Account (Inheritance)
class SavingsAccount extends Account{
    private double interestRate; // Encapsulated field

    // Constructor to initialize SavingsAccount with an interest rate
    public SavingsAccount(String accountHolder, double initialBalance, double interestRate){
        super(accountHolder, initialBalance);  // Call parent constructor
        this.interestRate = interestRate;
    }

    // Overriding withdraw method with overdraft support (Polymorphism)
    @Override
    public void withdraw(double amount){
        if(amount > 0 && amount <= getBalance()){
            super.deposite(amount); // Call parent method
            System.out.println(amount + " withdrawn successfully.");
        }
        else{
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

// CurrentAccount class inherits from Account (Inheritance)
class CurrentAccount extends Account {
    private double overdraftLimit;

    // Constructor to initialize CurrentAccount with an overdraft limit
    public CurrentAccount(String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountHolder, initialBalance);  // Call parent constructor
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding withdraw method with overdraft support (Polymorphism)
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            System.out.println("Withdrawing: " + amount + " from Current Account");
        } else {
            System.out.println("Withdrawal amount exceeds balance and overdraft limit.");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // Create SavingsAccount object
        SavingsAccount savings = new SavingsAccount("Alice", 10000, 5.0);
        savings.displayInfo();  // Display account details
        savings.deposit(2000);  // Deposit money
        savings.withdraw(3000); // Withdraw money from SavingsAccount

        System.out.println();

        // Create CurrentAccount object
        CurrentAccount current = new CurrentAccount("Bob", 5000, 2000);
        current.displayInfo();  // Display account details
        current.deposit(1000);  // Deposit money
        current.withdraw(6000); // Withdraw with overdraft support
    }
}
