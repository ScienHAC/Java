package com.scienhac;// packages used to group related classes and it generally for organization

public class Main { // classes are in PascalCase
    public static void main(String[] args) { // for function names, we use camelCase
        System.out.println("Hello, World! from the system nice to meet you!");
        int $fun; // $ is allowed in variable names, but not recommended
        int _fun; // _ is allowed in variable names, but not recommended
        double name = 12;
        float name2 = 12.5f; // float needs 'f' at the end to distinguish it from double if you not add f at the end it will be double it work as normal, but it will take more memory for conversion
        double a = 12.5d; // d is optional for double, but it is good practice to add it for clarity
        long c = 2443434433232L; // L is optional for long, but it is good practice to add it for clarity and as it by default integer so L is used to avoid error
        boolean t = true; // bool is not a valid type in Java, it should be boolean
        String name3 = "Science"; // string is a class in Java, not a primitive type, and it is used to represent text
        System.out.println(name + 12);
        System.out.print(name2 + 12.5); // print does not add a new line at the end, while println does
        // print is used to print without a new line, while println is used to print with a new line
    }
}
//addTwoNumber is camelCase
//AddTwoNumber is PascalCase
//char uses Unicode characters with UTF - 16 encoding, and it is 2 bytes long where normal char is 1 byte long and uses ASCII encoding, or we say UTF - 8 encoding
//Ascii is subset of Java characters, and it is 1 byte long
// default value is 0 and written as \u0000
//Boolean default value is false and take 1 byte of memory
//By default any decimal number is double for example 12.5 is double, and if you want to make it float, you have to add f at the end like 12.5f
//Especially decimal number or decimal point number literal is double not the variable type it depends on declaration.