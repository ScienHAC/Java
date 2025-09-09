package com.krmu.day_09_sep;

class Box {
    private int length, breadth, height;
    Box(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
   public int calvol(){
        return (length*breadth*height);
    }
}
