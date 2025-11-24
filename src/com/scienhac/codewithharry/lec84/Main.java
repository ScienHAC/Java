package com.scienhac.codewithharry.lec84;

class MyException extends Exception {
    @Override
    public String getMessage() {
        return "This is my exception message from MyException class.";
    }
}

class Myfunc {
    //    static void fun() { // without throws keyword it give error because it is checked exception
//    static void fun() throws MyException { // with throws keyword it work fine because we tell the compiler that this method may throw this exception so handle it where you call this method
//        System.out.println("Inside fun method");
//        throw new MyException();
//    }
//    static void fun() throws MyException { // without throw is still show error at main because the main thing here is the throws keyword it tell compiler that this method may throw this exception so handle it where you call this method
    // that's why we are able to throw or raise exception from this method
//
//    }
    static void fun() throws MyException {
        throw new MyException();
    }
}

public class Main {
    static int divide(int a, int b) {
        try { // one way handle here or second at the main method where we call divide method
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }

    static int divide1(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            Myfunc.fun();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        int x = divide(2, 0);
        System.out.println(divide1(4, 0));
    }
}
