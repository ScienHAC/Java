package com.scienhac.codewithharry.finallyKeyword;

/*
Finally can even execute if there is return statement in try or catch block
and it is used to execute some code no matter exception occur or not
it only not execute where manually terminate the program using System.exit(0) method or normally ctrl+c terminal interruption
 */
public class Main {
    static int func() {
        try {
            System.out.println("Inside try block");
            return 10;
        } catch (Exception e) {
            System.out.println("Inside catch block");
            return 20;
        } finally {
            System.out.println("Inside finally block");
        }
    }

    public static void main(String[] args) {
        try {
            int a = 12 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally { // we use finally block to execute some code no matter exception occur or not
            /*
            and it very helpful where we want to close some resources like file handling database connection etc <------------ it helpful clearing resource or something
            and also tell that these perticular block execution is done no matter exception occur or not
            1. if exception occur in try block then catch block execute then finally block execute
            2. if no exception occur in try block then catch block is skipped and finally block execute
            3. if there is return statement in try or catch block then also finally block execute before return
            4. if there is System.exit(0) in try or catch block then finally block will not execute because system exit terminate the program
            5. if there is exception in finally block then it will override the exception in try or catch block
             */
            System.out.println("This block is always executed.");
        }
        System.out.println("The return value from func() is: " + func());


        /*
        Normally we can't write java code without catch or vice versa try block but finally block can be used alone without catch block
        like
        try {
            // code that may throw an exception
        } finally {
            // code that will always execute
        }
         */
    }
}
