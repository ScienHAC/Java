package com.krmu.Lab_Assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.initializeSystem(n);
        sms.addStudent();
        sms.addStudent();
        sms.displayAllStudents();
        sc.close();
    }
}
