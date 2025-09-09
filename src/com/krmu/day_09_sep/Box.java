package com.krmu.day_09_sep;

class Box {
    private int length, breadth, height;
    Box(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    Box(){
        System.out.println("Default Constructor is Called");
    }

    public Box(Box b1) {
        this.length = b1.length;
        this.breadth = b1.breadth;
        this.height = b1.height;
    }

    public int calvol(){
        return (length*breadth*height);
    }
}
