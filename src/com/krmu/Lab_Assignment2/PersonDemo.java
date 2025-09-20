package com.krmu.Lab_Assignment2;

public class PersonDemo {
    public static void main(String[] args) {
        // Using default constructor
        Person p1 = new Person();
        p1.display();

        // Using parameterized constructor
        Person p2 = new Person("Alice", 25);
        p2.display();

        // Using copy constructor
        Person p3 = new Person(p2);
        p3.display();
    }
}
