package com.krmu.Assignment1;

import java.util.Scanner;

public class UserInterface {
    private Account[] accounts = new Account[100];
    private int count = 0;
    private Scanner sc = new Scanner(System.in);

    public void create() {
        System.out.print("Acc no: ");
        int no = sc.nextInt(); sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Balance: ");
        double bal = sc.nextDouble(); sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        accounts[count++] = new Account(no, name, bal, email, phone);
        System.out.println("Created!");
    }

    public void deposit() {
        System.out.print("Acc no: ");
        int no = sc.nextInt(); sc.nextLine();
        Account a = find(no);
        if (a == null) { System.out.println("Not found"); return; }
        System.out.print("Amount: ");
        double amt = sc.nextDouble(); sc.nextLine();
        a.deposit(amt);
    }

    public void withdraw() {
        System.out.print("Acc no: ");
        int no = sc.nextInt(); sc.nextLine();
        Account a = find(no);
        if (a == null) { System.out.println("Not found"); return; }
        System.out.print("Amount: ");
        double amt = sc.nextDouble(); sc.nextLine();
        a.withdraw(amt);
    }

    public void view() {
        System.out.print("Acc no: ");
        int no = sc.nextInt(); sc.nextLine();
        Account a = find(no);
        if (a == null) { System.out.println("Not found"); return; }
        a.displayAccountDetails();
    }

    public void update() {
        System.out.print("Acc no: ");
        int no = sc.nextInt(); sc.nextLine();
        Account a = find(no);
        if (a == null) { System.out.println("Not found"); return; }
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        a.updateContactDetails(email, phone);
    }

    private Account find(int no) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber() == no) return accounts[i];
        }
        return null;
    }
}
