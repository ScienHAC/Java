package com.krmu.thirdDay;
import java.util.Scanner;
public class MenuDriven {
    public static void main(String[] args) {
        System.out.println("Menu Driven Program");
        System.out.println("1. display options");
        System.out.println("2. for add");
        System.out.println("3. for delete");
        System.out.println("4. update");
        System.out.println("5. exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Option Available:");
                System.out.println("1. display options");
                System.out.println("2. for add");
                System.out.println("3. for delete");
                System.out.println("4. update");
                System.out.println("5. exit");
                break;
            case 2:
                System.out.println("Adding....");
                break;
            case 3:
                System.out.println("Deleting....");
                break;
            case 4:
                System.out.println("Updating....");
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }
}
