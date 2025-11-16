package com.krmu.Lab_Assignment3;

import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg) {
        super(msg);
    }
}

class Student {
    String name;
    int[] marks;

    Student(String name, int subjects) {
        this.name = name;
        this.marks = new int[subjects];
    }

    void setMarks(int index, int mark) throws InvalidMarksException {
        if (mark < 0 || mark > 100) {
            throw new InvalidMarksException("Invalid mark: " + mark);
        }
        marks[index] = mark;
    }

    double getAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length;
    }

    String getResult() {
        return getAverage() >= 50 ? "Pass" : "Fail";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Average: " + getAverage());
        System.out.println("Result: " + getResult());
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

class SumThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            if (name == null || name.isEmpty()) {
                throw new NullPointerException("Name cannot be empty");
            }

            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();

            Student student = new Student(name, subjects);

            for (int i = 0; i < subjects; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                int mark = sc.nextInt();
                student.setMarks(i, mark);
            }

            student.display();

        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

        System.out.println("\nStarting threads...");
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();
        SumThread t3 = new SumThread();

        t1.start();
        t2.start();
        t3.start();

        sc.close();
    }
}
