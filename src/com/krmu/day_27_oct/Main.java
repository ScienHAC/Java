package com.krmu.day_27_oct;
abstract class Area{
    abstract double calculateArea();
}
class Circle extends Area{
    double r;
    double calculateArea(){
        return 3.14*r*r;
    }
    void display(){
        System.out.println("Area of Circle" + calculateArea());
    }
}
class Rectangle extends Area{
    double l,b;
    double calculateArea(){
        return l*b;
    }
    void display(int l, int b){
        System.out.println("Area of Circle" + calculateArea());
    }
}

public class Main {
}
