package com.krmu.day_23_sep.Program2;

class Shape {
    public void area(int a){
        System.out.println("hello....");
    }public void area(int a, int b){
        System.out.println("hello....");
    }
}
class Circle extends Shape {
    @Override
    public void area(int a) {
        System.out.println("Area of the circle: "+(3.14*a*a));
    }
}

class Rectangle extends Shape {
    @Override
    public void area(int l, int b) {
        System.out.println("Area of the circle: "+(l*b));
    }
}

public class Area{
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.area(2);
        s2.area(1,3);
    }
}


