package com.krmu.Q7;

// Base class
class Shape {
    public void area() {
        System.out.println("Area of shape is not defined.");
    }
}

// Derived class 1
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overridden area() method
    @Override
    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Derived class 2
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overridden area() method
    @Override
    public void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(5.0);
        Rectangle r = new Rectangle(4.0, 6.0);

        c.area();
        r.area();
    }
}

