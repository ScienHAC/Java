package com.krmu.Lab_Assignment1;

import java.util.Scanner;

class StudentManagementSystem {
    Student[] students;
    int StudentCount;
    Scanner sc = new Scanner(System.in);

    public void initializeSystem(int size) {
        students = new Student[size];
    }

    public void addStudent() {
        if (students.length == StudentCount) {
            System.out.println("Student limit reached");
            return;
        }
//        Student student = new Student();
//        student.inputStudent();
//        students[StudentCount] = student;
//        this.StudentCount++;
        students[StudentCount] = new Student();
        students[StudentCount].inputStudent();
        this.StudentCount++;
    }

    public void displayAllStudents() {
        if (students.length == 0) {
            System.out.println("No students to display");
            return;
        }
        for (int i = 0; i < StudentCount; i++) {
            students[i].displayStudent();
            System.out.println("---------------");
        }
    }
}
