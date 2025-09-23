package com.krmu.day_23_sep.Program1;

class Animal {
    public void sound(){
        System.out.println("bobo");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class cat extends Animal{
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}