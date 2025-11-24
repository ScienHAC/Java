package com.scienhac.codewithharry.lec83;

//All exception are part of  java.lang package and see collection package are java.util package(data structures) and java.io package (input output operations) and so on
//java.lang have fundamental classes and interfaces closely tied to the language and runtime system so it is in PascalCase

/*
If you want to create unchecked exception then extend RuntimeException class
If you want to create checked exception then extend Exception class
RuntimeException is a child class of Exception class so Exception is Bigger than RuntimeException
 */
class Abc {

}

class MyException extends Exception {
    @Override
    public String toString() { // super.toString call the exception name along with the path + the getMessage method
        return super.toString() + "This is my exception";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "This is get message of my exception\t";
    }

    @Override
    public void printStackTrace() { // already print so no need to use println in the main method
        System.out.println("Printing stack trace of my exception");
    }
}

class MyRuntimeException extends RuntimeException {
    @Override
    public String toString() {
        return super.toString() + "This is my runtime exception";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "This is get message of my runtime exception";
    }

    @Override
    public void printStackTrace() { // already print so no need to use println in the main method
        System.out.println("Printing stack trace of my runtime exception");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException(); // it throw error if we not use try catch because it is checked exception
//            Based on understanding everyone just throw the throw method based on certain conditoin like a/b here b==0 so throw and pass the message nothing special about it
        } catch (MyException e) {// e is the object of MyException class
            System.out.println(e + "\n");// e by default call internally toString method so e.toString and e are same
            System.out.println(e.toString() + "\n");// e by default call internally toString method so e.toString and e are same
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//        throw new Abc(); there must be exception class to use throw keyword
//        try {
//            throw new ArithmeticException("This is an arithmetic exception");
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        throw new MyException(); // in intellij idea you see it raise error at complile time you will see in the build log because it is checked exception
        // same javac it throw error but the runtime is when we use java and run the file at runtime it will throw the exception
        //throw new MyRuntimeException(); // it will not give error because it is unchecked exception
    }
}
