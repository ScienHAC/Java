package com.test.secondDay;
import java.util.Scanner;
class calc{
    public int add(int a, int b){
        return a+b;
    }public double div(double a, double b){
        return (a/b);
    }public int div(int a, int b){
        return a-b;
    }public int add(int a, int b){
        return a+b;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature in cal: ");
        double cal = sc.nextDouble();
        double fh = (9/5.0*cal) + 32;
        System.out.println("\nThe conversion of cal "+cal+" into fahrenheit is: "+fh);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
    }
}
