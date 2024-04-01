package TaskCodeway;

import java.util.Scanner;
// Task 3
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
}

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial account balance: $");
        double initialBalance = sc.nextDouble();
        BankAccount userAccount = new BankAccount(initialBalance);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = sc.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = sc.nextDouble();
                    userAccount.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Current balance: $" + userAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM!");
                    System.exit(0);
                    break; // Add a break statement here
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
