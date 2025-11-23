package com.krmu.Q10;

import java.util.ArrayList;

// Base class
class Product {
    protected int id;
    protected String name;
    protected double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Overridden by subclasses
    public double calculateDiscount() {
        return 0.0;  // No discount for a generic product
    }

    public double finalPrice() {
        return price - calculateDiscount();
    }
}

// Electronics subclass
class Electronics extends Product {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10;  // 10% discount
    }
}

// Clothing subclass
class Clothing extends Product {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20;  // 20% discount
    }
}

// Groceries subclass
class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05;  // 5% discount
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Polymorphic product list
        ArrayList<Product> cart = new ArrayList<>();

        cart.add(new Electronics(101, "Laptop", 50000));
        cart.add(new Clothing(102, "T-Shirt", 800));
        cart.add(new Groceries(103, "Rice 10kg", 550));

        double totalBill = 0;

        System.out.println("----- Bill Details -----");
        for (Product p : cart) {
            System.out.println("Product: " + p.name);
            System.out.println("Original Price: ₹" + p.price);
            System.out.println("Discount: ₹" + p.calculateDiscount());
            System.out.println("Final Price: ₹" + p.finalPrice());
            System.out.println();

            totalBill += p.finalPrice();
        }

        System.out.println("TOTAL BILL: ₹" + totalBill);
    }
}
