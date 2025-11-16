package com.krmu.day_27_oct.Problem2;

abstract class BankAccount {
    double accountNumber;
    double balance;
    abstract double calculateInterest();
    void displayBalance(){
        System.out.println("Your Account Balance: "+this.balance);
    }
}

class savingAccount extends BankAccount{
    double interestRate = 0.04;
    double calculateInterest(){
        this.balance = (balance*interestRate)/100 + balance;
        return (balance*interestRate)/100;
    }
}
class currentAccount extends BankAccount{
    double interestRate = 0.02;
    double calculateInterest(){
        this.balance = (balance*interestRate)/100 + balance;
        return (balance*interestRate)/100;
    }
}