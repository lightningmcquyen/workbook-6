package com.pluralsight.asset;

public class CreditCard implements Valuable {
    private double balance;
    private double creditLimit;

    // Constructor
    public CreditCard(double creditLimit) {
        this.balance = 0.0;
        this.creditLimit = creditLimit;
    }

    // Charge method
    public void charge(double amount) {
        if (amount > 0 && balance + amount <= creditLimit) {
            balance += amount;
            System.out.println("Charged: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Declined. Exceeds credit limit.");
        }
    }

    // Pay method
    public void pay(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Paid: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Payment amount must be greater than zero and may not exceed balance.");
        }
    }

    // Implement getValue() for CreditCard
    @Override
    public double getValue() {
        return -balance;  // Credit card balance reps debt, so the value is negative
    }
}