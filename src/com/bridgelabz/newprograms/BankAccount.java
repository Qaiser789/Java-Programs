package com.bridgelabz.newprograms;

import java.util.Scanner;

public class BankAccount {
	
	private double balance;
    private long accountNumber;

    // Created constructor
    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; 
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of Rs" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    // Method to withdraw money , current balance, account number
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of Rs" + amount + " successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        // Creating an instance of the BankAccount class
        BankAccount account1 = new BankAccount(123456789);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: Rs");
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);

        System.out.println("Current Balance: Rs" + account1.getBalance());

        System.out.print("Enter the amount to withdraw: Rs");
        double withdrawAmount = scanner.nextDouble();
        account1.withdraw(withdrawAmount);

        System.out.println("Current Balance: Rs" + account1.getBalance());
        scanner.close();
    }

}
