package com.scienhac.codewithharry.thisKeyword;

//this is tied to the object that in actual memory or the datatype is parent class or subclass it refer to the actual object in the memory

class Abc {
    void show() {
        System.out.println(23);
        this.show();
    }
}

class bcd extends Abc {
    void show() {
        System.out.println("In BCD show method");
    }

    void a() {
        super.show();
    }
}

class A {
    int a = 20;

    void show() {
        System.out.println(this.getClass().getName());
    }

    void num() {
        System.out.println(this.a);
    }
}

class B extends A {
//    int a = 434; --> that a is differnt from class A a so if i not declare and say a = 434 so it diretly udate a class where this try to catch a vairable value but that a the value is already  change and if i do these we can't see new thing

    void check() {
        super.show();
    }

    void game() {
        a = 434;
        super.num();
    }
}

public class Main {
    public static void main(String[] args) {
        new bcd().a();
        new A().show();
        new B().show();
        new B().check();
        new B().game();
    }
}
