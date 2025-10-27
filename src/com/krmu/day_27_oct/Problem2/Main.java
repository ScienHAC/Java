package com.krmu.day_27_oct.Problem2;

public class Main {
    public static void main(String[] args) {
        BankAccount sa = new savingAccount();
        sa.accountNumber = 123456;
        sa.balance = 10000;
        System.out.println("Interest earned in Saving Account: " + sa.calculateInterest());
        sa.displayBalance();

        BankAccount ca = new currentAccount();
        ca.accountNumber = 654321;
        ca.balance = 20000;
        System.out.println("Interest earned in Current Account: " + ca.calculateInterest());
        ca.displayBalance();
    }
}
