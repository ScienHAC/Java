package com.scienhac.codewithharry.lec14;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello World %3.2f", 42.4343); // format and printf work same and also in java there is no format specifier for boolean and the double here it is use %f for both with precision and one more thing is that in java we have to use %n for new line instead of \n like in c
//        finally like in c there is %.*s for precision in string, and we did is ,3,"harry" it will print har but in java we have to use %3.2s for precision in string, and we did is %.2s,"harry" it will print ha and what 3 here do as no of spaces included the total length of string that after formated or after precision specified in string
//        in java they not allow variable precision like in c we can do %.*s but in java we have to use %3.2s for precision in string, and we did is %.2s,"harry" it will print ha and what 3 here do as no of spaces included the total length of string that after formated or after precision specified in string
//        in c we can do is %*.*s but in java we have to use %3.2s for precision in string, and we did is %.2s,"harry" it will print ha and what 3 here do as no of spaces included the total length of string that after formated or after precision specified in string
        System.out.format("Hello World");
    }
}
