package com.pluralsight.asset;

public class AssetPortfolio {
    public static void main(String[] args) {
        // Create FixedAsset objects
        FixedAsset jewelry = new Jewelry("Chrome Hearts", 1600, 18);  // Market value, karat
        FixedAsset house = new House("Luxury Beach Villa", 400000, 2002, 4000, 5);  // Market value, square ft., 5 bedrooms

        // Create Liquid Account objects
        BankAccount bankAccount = new BankAccount(50000);
        CreditCard creditCard = new CreditCard(1000000);

        // Create Portfolio and add assets and accounts
        Portfolio portfolio = new Portfolio("My Portfolio", "Quyen Vong");
        portfolio.add(jewelry);
        portfolio.add(house);
        portfolio.add(bankAccount);
        portfolio.add(creditCard);

        // Perform some transactions
        bankAccount.deposit(500000);
        creditCard.charge(7000);

        // Get the total value of the portfolio
        System.out.println("Total Portfolio Value: " + portfolio.getTotalValue());  // Includes both assets and liquid accounts
    }
}