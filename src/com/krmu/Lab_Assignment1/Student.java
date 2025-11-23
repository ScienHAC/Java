package com.krmu.Lab_Assignment1;

import java.util.Scanner;

class Student {
    private int rollno;
    private String name;
    private String course;
    private double marks;
    private char grade;

    public void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roll: ");
        this.rollno = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter your name: ");
        this.name = sc.nextLine();
        System.out.println("Enter your course: ");
        this.course = sc.nextLine();
        System.out.println("Enter your marks: ");
        this.marks = sc.nextDouble();
        calculateGrade();
    }

    public void calculateGrade() {
        if (this.marks >= 90) {
            this.grade = 'A';
        } else if (this.marks >= 80) {
            this.grade = 'B';
        } else if (this.marks >= 70) {
            this.grade = 'C';
        } else if (this.marks >= 60) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
    }

    public void displayStudent() {
        System.out.println("Roll No: " + this.rollno);
        System.out.println("Name: " + this.name);
        System.out.println("Course: " + this.course);
        System.out.println("Marks: " + this.marks);
        System.out.println("Grade: " + this.grade);
    }
}
