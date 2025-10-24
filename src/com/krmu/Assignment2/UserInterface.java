package com.krmu.Assignment2;

import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner;
    private final Calculator calculator;

    public UserInterface() {
        scanner = new Scanner(System.in);
        calculator = new Calculator();
    }

    public void performAddition() {
        System.out.println("\n--- Addition Operation ---");
        System.out.println("1. Add two integers");
        System.out.println("2. Add two decimal numbers");
        System.out.println("3. Add three integers");
        System.out.print("Choose operation type: ");

        try {
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter first integer: ");
                    int num1 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter second integer: ");
                    int num2 = Integer.parseInt(scanner.nextLine());
                    int result1 = calculator.add(num1, num2);
                    System.out.println("Result: " + result1);
                    break;

                case 2:
                    System.out.print("Enter first decimal number: ");
                    double dnum1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter second decimal number: ");
                    double dnum2 = Double.parseDouble(scanner.nextLine());
                    double result2 = calculator.add(dnum1, dnum2);
                    System.out.println("Result: " + result2);
                    break;

                case 3:
                    System.out.print("Enter first integer: ");
                    int n1 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter second integer: ");
                    int n2 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter third integer: ");
                    int n3 = Integer.parseInt(scanner.nextLine());
                    int result3 = calculator.add(n1, n2, n3);
                    System.out.println("Result: " + result3);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers!");
        }
    }

    public void performSubtraction() {
        System.out.println("\n--- Subtraction Operation ---");
        try {
            System.out.print("Enter first integer: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter second integer: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            int result = calculator.subtract(num1, num2);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers!");
        }
    }

    public void performMultiplication() {
        System.out.println("\n--- Multiplication Operation ---");
        try {
            System.out.print("Enter first decimal number: ");
            double num1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter second decimal number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double result = calculator.multiply(num1, num2);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid decimal numbers!");
        }
    }

    public void performDivision() {
        System.out.println("\n--- Division Operation ---");
        try {
            System.out.print("Enter first integer (numerator): ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter second integer (denominator): ");
            int num2 = Integer.parseInt(scanner.nextLine());

            int result = calculator.divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mainMenu() {
        boolean running = true;

        System.out.println("===========================================");
        System.out.println("  Welcome to Calculator Application!");
        System.out.println("===========================================");

        while (running) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        performAddition();
                        break;
                    case 2:
                        performSubtraction();
                        break;
                    case 3:
                        performMultiplication();
                        break;
                    case 4:
                        performDivision();
                        break;
                    case 5:
                        System.out.println("\nThank you for using Calculator Application!");
                        System.out.println("Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number!");
            }
        }

        scanner.close();
    }
}
