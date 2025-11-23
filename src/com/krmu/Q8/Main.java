package com.krmu.Q8;

class Car {
    private String brand;
    private String model;
    private int year;

    // No-argument constructor
    public Car() {
        this("Unknown");   // calls one-argument constructor
    }

    // One-argument constructor
    public Car(String brand) {
        this(brand, "Not Specified", 0); // calls three-argument constructor
    }

    // Three-argument constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();                      // no-argument constructor
        Car c2 = new Car("Toyota");              // one-argument constructor
        Car c3 = new Car("Honda", "Civic", 2020); // three-argument constructor

        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
    }
}

