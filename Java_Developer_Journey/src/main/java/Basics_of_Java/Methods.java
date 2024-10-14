package main.java.Basics_of_Java;

import java.util.Scanner;

/**
 * Methods
 */
public class Methods {

    // Instance variable to store account balance
    private double balance;

    // Constructor to initialize the account balance
    public Methods(double initialBalance) {
        this.balance = initialBalance;
    }

    // Instance Method: Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid amount. Deposite failed.");
        }
    }

    // Instance Method: Withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }

    }

    // Instance Method: Check the current balance
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Static Method: Calculate interest on the balance
    // This method is static because interest rate is fixed and not tied to a
    // particular instance of the class
    public static double calculateInterest(double balance) {
        double interestRate = 0.06;
        return balance * interestRate;
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a new bank account with an initial balance
        System.out.println("Enter the initial balance of your account: ");
        double initialBalance = sc.nextDouble();
        Methods account = new Methods(initialBalance);

        // Menu-driven system
        while (true) {
            System.out.println("\nChoose an option: ");
            System.out.println("1. Deposite Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposite: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawnAmount = sc.nextDouble();
                    account.withdraw(withdrawnAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    double interest = Methods.calculateInterest(account.balance);
                    System.out.println("Calculate Interest: " + interest);
                    break;

                case 5:
                    System.out.println("Thank you for using our banking system.");
                    sc.close(); // Closing the scanner to release resources
                    System.exit(0); // Terminating the program with a successful exit code

                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }

    }
}