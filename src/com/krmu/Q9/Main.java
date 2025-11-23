package com.krmu.Q9;

// Base class
class Student {
    protected int rollNo;
    protected String name;
    protected String course;

    // Constructor to initialize student details
    public Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }
}

// Derived class 1 (from Student)
class Marks extends Student {
    protected int m1, m2, m3;

    // Constructor to initialize student + marks
    public Marks(int rollNo, String name, String course, int m1, int m2, int m3) {
        super(rollNo, name, course);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

// Derived class 2 (from Marks → multilevel)
class Result extends Marks {
    private int total;
    private double percentage;
    private String grade;

    public Result(int rollNo, String name, String course, int m1, int m2, int m3) {
        super(rollNo, name, course, m1, m2, m3);
        calculateResult();
    }

    // Method to compute total, percentage, grade
    private void calculateResult() {
        total = m1 + m2 + m3;
        percentage = (total / 3.0);

        if (percentage >= 90) grade = "A";
        else if (percentage >= 75) grade = "B";
        else if (percentage >= 50) grade = "C";
        else grade = "D";
    }

    // Display all details
    public void display() {
        System.out.println("----- Student Result -----");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);

        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating Result object → automatically stores student + marks
        Result r = new Result(101, "Piyush Sharma", "B.Tech CSE", 85, 78, 92);

        // Display full details
        r.display();
    }
}

