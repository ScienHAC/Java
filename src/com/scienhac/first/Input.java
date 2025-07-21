package com.scienhac.first;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in); // we need to provide the run time memory address of the Scanner object
        //System.in which is the standard input stream, or we can say input from keyboard
        //sc give ability to read input from the keyboard, but it is not implemented yet
//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.println(name + " is your name");
//        int age = sc.nextInt();
//        System.out.println("Your age is: " + age);
//        float b = sc.nextFloat();//see next*() are the methods of the class access via object sc and java input is type based so they coupled in the class Scanner
//        System.out.println("Enter a paragraph (press Enter on an empty line to finish):");
//        StringBuilder paragraph = new StringBuilder();
//        String line;
//        while (!(line = sc.nextLine()).isEmpty()) {
//            paragraph.append(line).append("\n");
//        }
//        System.out.println("Your paragraph:\n" + paragraph.toString());

        boolean t = sc.hasNextInt(); // take input and validate it
        System.out.println("Has next int: " + t);
    }
}
