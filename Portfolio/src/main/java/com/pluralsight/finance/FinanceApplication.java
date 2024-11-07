package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        // Create BankAccount objects
        BankAccount account1 = new BankAccount(123, "Pam", 12500);  // account1 is a BankAccount object
        Valuable account2 = new BankAccount(456, "Gary", 1500);    // account2 is a BankAccount object but referenced as Valuable

        // Try to deposit money into both accounts
        account1.deposit(100);  // This works because account1 is a BankAccount and has access to deposit()

        // The following line will NOT compile because account2 is referenced as a Valuable object, which does not have the deposit() method available.
        account2.deposit(100); // error because 'Valuable' doesn't have deposit()

        // Display new balances
        System.out.println(account1.getName() + " balance: " + account1.getBalance());  // account1 balance will show after deposit
        // account2.deposit(100);  // This will not work for account2 because it is referenced as Valuable. So, the balance for account2 remains unchanged
        System.out.println(account2.getName() + " balance: " + account2.getValue()); // account2 balance shows the value, but deposit didn't work for account2
    }
}