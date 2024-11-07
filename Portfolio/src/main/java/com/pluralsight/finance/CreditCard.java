package com.pluralsight.finance;

public class CreditCard implements Valuable {
    final private String name;
    final private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }


    public void charge(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Charge amount must be positive...");
        }
    }

    public void pay(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;  // Decrease the balance (pay off debt)
        } else {
            System.out.println("Invalid payment amount...");
        }
    }


    @Override
    public double getValue() {
        return balance;  // Outstanding balance
    }
}