package com.krmu.day_09_sep;

public class Main {
    public static void main(String[] args){
        Box b1 = new Box(2,3,4);
        int b = b1.calvol();
        Box b2 = new Box(b1);
        System.out.printf("The volume of Box is: %d",b);
    }
}
