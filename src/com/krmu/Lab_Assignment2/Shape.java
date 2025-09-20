package com.krmu.Lab_Assignment2;

public class Shape {
    double radius;
    double length, width;

    // Constructor for circle
    Shape(double radius) {
        this.radius = radius;
        this.length = 0;
        this.width = 0;
    }

    // Constructor for rectangle
    Shape(double length, double width) {
        this.length = length;
        this.width = width;
        this.radius = 0;
    }

    // Method to calculate and display area of circle
    void areaCircle() {
        if (radius > 0) {
            double area = Math.PI * radius * radius;
            System.out.println("Area of Circle with radius " + radius + " is: " + area);
        } else {
            System.out.println("Not a circle shape.");
        }
    }

    // Method to calculate and display area of rectangle
    void areaRectangle() {
        if (length > 0 && width > 0) {
            double area = length * width;
            System.out.println("Area of Rectangle with length " + length + " and width " + width + " is: " + area);
        } else {
            System.out.println("Not a rectangle shape.");
        }
    }
}
