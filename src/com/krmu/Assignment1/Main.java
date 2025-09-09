package com.krmu.Assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Banking Application ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Account Details");
            System.out.println("5. Update Contact Details");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    ui.create();
                    break;
                case 2:
                    ui.deposit();
                    break;
                case 3:
                    ui.withdraw();
                    break;
                case 4:
                    ui.view();
                    break;
                case 5:
                    ui.update();
                    break;
                case 6:
                    System.out.println("Thank you for using Banking Application!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
