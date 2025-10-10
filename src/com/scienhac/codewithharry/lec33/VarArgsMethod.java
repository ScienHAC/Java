package com.scienhac.codewithharry.lec33;

public class VarArgsMethod {
//    static int sum(int... arr) {
//        // this is variable arguments method in java
//        // this is used when we don't know how many arguments will be passed
//        // this is used when we want to pass an array as an argument
//        // this is used when we want to pass a list of arguments
//        // this is used when we want to pass a variable number of arguments

    /// /        here arr is an array of integers
//        int result = 0;
//        for (int e : arr) {
//            result += e;
//        }
//        return result;
//    }
    static int sum(int x, int... arr) {
        // this is variable arguments method in java
        // this is used when we don't know how many arguments will be passed
        // this is used when we want to pass an array as an argument
        // this is used when we want to pass a list of arguments
        // this is used when we want to pass a variable number of arguments
//        here arr is an array of integers
        int result = 0;
        for (int e : arr) {
            result += e;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 1,2 is " + sum(1, 2));
        System.out.println("The sum of 1,2,3 is " + sum(1, 2, 3));
        System.out.println("The sum of 1,2,3,4 is " + sum(1, 2, 3, 4));
        System.out.println("The sum of 1,2,3,4,5 is " + sum(1, 2, 3, 4, 5));
        System.out.println("The sum of 1,2,3,4,5,6 is " + sum(1, 2, 3, 4, 5, 6));
//        System.out.println("The sum of no argument is " + sum()); // allow but here we have to pass at least one argument as we have defined int x as first argument
    }
    /*
    in C++ we have these variable argument function using ellipsis ...
    like
    int sum(int n, ...){
        va_list list;
        va_start(list, n);
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += va_arg(list, int);
        }
        va_end(list);
        return result;
        or typename introduce in c++11
        template<typename ...T>
        int sum(T ...args){
            int result = 0;
            for (auto e: args)
            {
                result += e;
            }
            return result;
        }
    }

    in python, we have *args and **kwargs for variable argument function
     */
}
