package com.pluralsight.asset;

public class BankAccount implements Valuable {
    private double balance;
    private double creditLimit;

    // Constructor
    public BankAccount(double creditLimit) {
        this.balance = 0.0;
        this.creditLimit = creditLimit;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient Funds.");
        }
    }

    // Implement getValue() for BankAccount
    @Override
    public double getValue() {
        return balance;  // current balance
    }
}