package com.krmu.Q5;

import java.util.Scanner;

// Custom Exception Class
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int[] marks = new int[3];

    // Constructor
    public Student(String name, int m1, int m2, int m3) throws InvalidMarksException {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException("Student name cannot be null or empty");
        }

        this.name = name;
        marks[0] = validateMarks(m1);
        marks[1] = validateMarks(m2);
        marks[2] = validateMarks(m3);
    }

    // Validate individual marks
    private int validateMarks(int m) throws InvalidMarksException {
        if (m < 0 || m > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100. Given: " + m);
        }
        return m;
    }

    // Calculate average
    public double getAverage() {
        return (marks[0] + marks[1] + marks[2]) / 3.0;
    }

    // Determine pass/fail
    public String getResult() {
        return getAverage() >= 40 ? "PASS" : "FAIL";
    }

    // Display details
    public void display() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Average: " + getAverage());
        System.out.println("Result: " + getResult());
    }
}

public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks of Subject 1: ");
            int m1 = sc.nextInt();

            System.out.print("Enter marks of Subject 2: ");
            int m2 = sc.nextInt();

            System.out.print("Enter marks of Subject 3: ");
            int m3 = sc.nextInt();

            // Create student object
            Student s = new Student(name, m1, m2, m3);

            // Display result
            s.display();

        } catch (InvalidMarksException e) {
            System.out.println("Invalid Marks Error: " + e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("Input Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e);

        } finally {
            sc.close();
            System.out.println("\nProgram Finished.");
        }
    }
}

