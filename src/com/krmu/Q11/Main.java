package com.krmu.Q11;

import java.util.Scanner;

// Abstract class
abstract class Transport {
    public abstract double calculateFare(double distance);
}

// Bus subclass
class Bus extends Transport {
    @Override
    public double calculateFare(double distance) {
        return distance * 5;   // ₹5 per km
    }
}

// Train subclass
class Train extends Transport {
    @Override
    public double calculateFare(double distance) {
        return distance * 3.5; // ₹3.5 per km
    }
}

// Flight subclass
class Flight extends Transport {
    @Override
    public double calculateFare(double distance) {
        return distance * 15 + 500; // ₹15 per km + ₹500 base charge
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Transport Type:");
        System.out.println("1. Bus");
        System.out.println("2. Train");
        System.out.println("3. Flight");
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();

        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        Transport transport;

        switch (choice) {
            case 1:
                transport = new Bus();
                break;
            case 2:
                transport = new Train();
                break;
            case 3:
                transport = new Flight();
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        double fare = transport.calculateFare(distance);
        System.out.println("\nTotal Fare: ₹" + fare);

        sc.close();
    }
}

