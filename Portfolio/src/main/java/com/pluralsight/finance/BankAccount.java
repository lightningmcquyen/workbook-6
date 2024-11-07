package com.pluralsight.finance;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }


    @Override
    public double getValue() {
        return balance;
    }
}