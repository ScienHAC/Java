package com.course.secondDay;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check if it is a leap year: ");
        int Year = sc.nextInt();
        if ((Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0) {
            System.out.println(Year + " is a leap year.");
        } else {
            System.out.println(Year + " is not a leap year.");
        }
        sc.close();
    }
}
