package com.krmu.Assignment1;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String email;
    private String phoneNumber;

    public Account(int accountNumber, String accountHolderName, double initialBalance, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName != null ? accountHolderName.trim() : "";
        this.balance = Math.max(0, initialBalance);
        this.email = email != null ? email.trim() : "";
        this.phoneNumber = phoneNumber != null ? phoneNumber.trim() : "";
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) { System.out.println("Amount must be +ve"); return false; }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) { System.out.println("Amount must be +ve"); return false; }
        if (amount > balance) { System.out.println("Not enough balance"); return false; }
        balance -= amount;
        return true;
    }

    public void displayAccountDetails() {
        System.out.println("Acc No: " + accountNumber);
        System.out.println("Name  : " + accountHolderName);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phoneNumber);
        System.out.println("Bal   : " + balance);
    }

    public void updateContactDetails(String email, String phoneNumber) {
        if (email != null) this.email = email.trim();
        if (phoneNumber != null) this.phoneNumber = phoneNumber.trim();
    }
}
