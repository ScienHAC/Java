package com.scienhac.second_calculator;

import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        System.out.println("Percentage Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks for each subject (e.g., 100):");
        int t = sc.nextInt();
        double mark1, mark2, mark3, mark4, mark5;
        System.out.println("Enter marks for 5 subjects (out of 100):");
        System.out.print("Subject 1: ");
        mark1 = sc.nextDouble();
        System.out.print("Subject 2: ");
        mark2 = sc.nextDouble();
        System.out.print("Subject 3: ");
        mark3 = sc.nextDouble();
        System.out.print("Subject 4: ");
        mark4 = sc.nextDouble();
        System.out.print("Subject 5: ");
        mark5 = sc.nextDouble();
        double totalMarks = mark1 + mark2 + mark3 + mark4 + mark5;
        double percentage = (totalMarks / (5 * t)) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }
}
