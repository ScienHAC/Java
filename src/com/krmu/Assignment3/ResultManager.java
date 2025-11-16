package com.krmu.Assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

class ResultManager {
    Student[] students = new Student[100];
    int count = 0;
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        try {
            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            int[] marks = new int[3];
            System.out.println("Enter marks for 3 subjects:");
            for (int i = 0; i < 3; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }

            Student s = new Student(roll, name, marks);
            s.validateMarks();
            students[count++] = s;

            System.out.println("Student added successfully!");

        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input!");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println();
        }
    }

    public void showStudentDetails() {
        try {
            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();

            for (int i = 0; i < count; i++) {
                if (students[i].rollNumber == roll) {
                    students[i].displayResult();
                    return;
                }
            }
            System.out.println("Student not found!");

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input!");
            sc.nextLine();
        }
    }

    public void run() {
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Show Student Details");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1: addStudent(); break;
                    case 2: showStudentDetails(); break;
                    case 3:
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    default: System.out.println("Invalid choice!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Enter a number!");
                sc.nextLine();
            }
        }
    }
}

