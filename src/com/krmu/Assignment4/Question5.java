package com.krmu.Assignment4;

import java.util.ArrayList;

public class Question5 {
    public static void run() {
        System.out.println("=== Question 5: ArrayList Operations ===");

        ArrayList<String> students = new ArrayList<>();

        System.out.println("1. Adding elements:");
        students.add("Rahul");
        students.add("Priya");
        students.add("Amit");
        students.add("Neha");
        System.out.println("ArrayList: " + students);

        System.out.println("\n2. Searching elements:");
        System.out.println("Contains 'Amit': " + students.contains("Amit"));
        System.out.println("Index of 'Priya': " + students.indexOf("Priya"));

        System.out.println("\n3. Updating elements:");
        students.set(1, "Kavya");
        System.out.println("After update: " + students);

        System.out.println("\n4. Removing elements:");
        students.remove("Amit");
        System.out.println("After removing 'Amit': " + students);
        students.remove(0);
        System.out.println("After removing index 0: " + students);

        System.out.println("\n5. Other operations:");
        System.out.println("Size: " + students.size());
        System.out.println("Is empty: " + students.isEmpty());

        System.out.println();
    }
}

