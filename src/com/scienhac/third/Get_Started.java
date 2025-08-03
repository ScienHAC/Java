package com.scienhac.third;

import java.util.Scanner;

public class Get_Started {
    public static void main(String[] args) {
        System.out.println("Welcome" + " world"); // String concatenation using + operator in c++ we can use via cout<<string("the")+"noice"
        Scanner sc = new Scanner(System.in), test = new Scanner(System.in); // Creating a Scanner object to read input from the console
//        if (sc.hasNextInt()) {
//            int value = sc.nextInt();   // Safely read the int
//            System.out.println("You entered: " + value);
//        } else {
//            System.out.println("That's not an integer!");
//        }
//
//        int x = test.nextInt();
//        System.out.println("You entered: " + x);
        double y = 3.75;
        System.out.println(4 % 2.1);
        System.out.println(y % 2.1);
        System.out.println(y % 2);

    }
}
