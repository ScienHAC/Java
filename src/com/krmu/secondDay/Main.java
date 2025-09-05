package com.krmu.secondDay;
import java.util.Scanner;
class Calc{
    public int add(int a, int b){
        return a+b;
    }public double div(double a, double b){
        return (a/b);
    }public int sub(int a, int b){
        return a-b;
    }public int mul(int a, int b){
        return a*b;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature in cal: ");
        double cal = sc.nextDouble();
        double fh = (9/5.0*cal) + 32;
        System.out.println("\nThe conversion of cal "+cal+" into fahrenheit is: "+fh);
        Calc c = new Calc();
        while (true){
            System.out.println("Enter operation (+, -, *, /) or 'exit' to quit:");
            String operation = sc.next();

            if (operation.equals("exit")) {
                break;
            }

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            if (operation.equals("+")) {
                System.out.println("Result: " + c.add(num1, num2));
            } else if (operation.equals("-")) {
                System.out.println("Result: " + c.sub(num1, num2));
            } else if (operation.equals("*")) {
                System.out.println("Result: " + c.mul(num1, num2));
            } else if (operation.equals("/")) {
                if (num2 != 0) {
                    System.out.println("Result: " + c.div(num1, num2));
                } else {
                    System.out.println("Error: Division by zero!");
                }
            } else {
                System.out.println("Invalid operation!");
            }
        }
    }
}
