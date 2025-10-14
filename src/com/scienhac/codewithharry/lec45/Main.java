package com.scienhac.codewithharry.lec45;

class Base {
    public Base(int t) {
        System.out.println("I am a constructor");
    }

    public Base() {
        System.out.println("I am a constructor no parameters");
    }

    void greet() {
        System.out.println("Good Morning");
    }

    int temp() {
        System.out.println("I am temp method of base class");
        return 0;
    }
}

class Derived extends Base {
    public Derived(int x) {
//        super(); optional call to parent constructor by default it run default constructor until you call super with parameters
        super(5);//multiple super calls are not allowed, and it must be the first statement
        System.out.println("I am a constructor with value " + x);
    }

    public Derived(int x, int y) {
//        super(); optional call to parent constructor by default it run default constructor until you call super with parameters
        super(5);//multiple super calls are not allowed, and it must be the first statement
        System.out.println("I am a constructor with value " + x);
    }

    @Override
    public int temp() {
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Derived d = new Derived(5);
    }
}
