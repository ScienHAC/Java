package com.krmu.Lab_Assignment2;

public class ShapeDemo {
    public static void main(String[] args) {
        // Create circle object with radius 7
        Shape circle = new Shape(7);
        circle.areaCircle();

        // Create rectangle object with length 10 and width 5
        Shape rectangle = new Shape(10, 5);
        rectangle.areaRectangle();
    }
}
