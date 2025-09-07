package com.course.secondDay;

public class Greatest {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int greatest = a; // Assume a is the greatest initially

        if (b > greatest) {
            greatest = b; // Update if b is greater
        }
        if (c > greatest) {
            greatest = c; // Update if c is greater
        }

        System.out.println("The greatest number is: " + greatest);
    }
}
