package com.scienhac.codewithharry.lec80;

/*
Runtime error --> exception which can handle but not all like StackOverflowError, OutOfMemoryError
we have two types of exceptions
1. Checked Exception --> exception which occur at compile time( IDE will show error if not handled) and these can be done by programmer to explain it can occur exception because they know about it
like IOException, SQLException even when we use thread sleep method it shows InterruptedException which is a checked exception or the join method of thread class also shows InterruptedException
2. Unchecked Exception --> exception which occur at runtime that is not checked at compile time these are due to logical errors by programmer like ArithmeticException, NullPointerException, ArrayIndexOutOfBoundException etc which programmer might not be aware of it
 */

/*
All exceptions are the part of java.lang package and the hierarchy is
                        Object
                           |
                        Throwable
                           |
                ------------------------
                |                      |
             Error                  Exception
                                        |
                        -----------------------------
                        |                           |
                  Checked Exception          Unchecked Exception
 */
public class Main {
    public static void main(String[] args) {
//        try{
//
//        }catch(Exception e){
//
//        }

//        Most Used Exceptions
/*
ArithmeticException

NullPointerException

ArrayIndexOutOfBoundsException

IllegalArgumentException

IllegalStateException

RuntimeException

Exception

Error

Throwable

ClassCastException

NegativeArraySizeException

NumberFormatException

IndexOutOfBoundsException
 */
    }
}
