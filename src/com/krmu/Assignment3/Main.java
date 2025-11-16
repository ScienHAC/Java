package com.krmu.Assignment3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Assignment 3");
        System.out.println("1. Student Result Management System");
        System.out.println("2. Thread Odd-Even Program");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            ResultManager rm = new ResultManager();
            rm.run();
        } else if (choice == 2) {
            System.out.println("\nOdd-Even Thread Program\n");
            OddEvenPrinter printer = new OddEvenPrinter();
            printer.run();
            System.out.println("\nThreads completed!");
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
