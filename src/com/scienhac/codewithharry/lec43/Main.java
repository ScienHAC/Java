//package com.scienhac.codewithharry.lec43;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Random rand = new Random();
//        boolean running = true;
//        do {
//            System.out.println("1. Play Game");
//            System.out.println("2. Exit");
//            System.out.print("Enter your choice: ");
//            int choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    int guess = rand.nextInt(100) + 1;
//                    System.out.println("Guess a number between 1 to 100: ");
//                    while (true) {
//                        int comp = sc.nextInt();
//                        if (comp == guess) {
//                            System.out.println("You guessed it right!");
//                            break;
//                        } else if (comp < guess) {
//                            System.out.println("Too low! Please choose higher number.");
//                        } else {
//                            System.out.println("Too high! Please choose lower number.");
//                        }
//                    }
//                    break;
//                case 2:
//                    System.out.println("Exiting the program.");
//                    running = false;
//                    break;
//            }
//        } while (running);
//    }
//}

package com.scienhac.codewithharry.lec43;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean running = true;

        while (running) {
            System.out.println("\n1. Play Game\n2. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                int guess = rand.nextInt(100) + 1;
                System.out.println("Guess a number between 1 to 100: ");
                int comp;
                do {
                    comp = sc.nextInt();
                    if (comp < guess) System.out.println("Too low! Choose higher number.");
                    else if (comp > guess) System.out.println("Too high! Choose lower number.");
                } while (comp != guess);
                System.out.println("You guessed it right!");
            } else if (choice == 2) {
                System.out.println("Exiting the program.");
                running = false;
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
