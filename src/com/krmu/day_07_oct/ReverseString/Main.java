package com.krmu.day_07_oct.ReverseString;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();
        for(int i = 0; i<input.length()/2;i++) {
            charArray[i] = input.charAt(input.length()-1-i);
            charArray[input.length()-1-i] = input.charAt(i);
        }
        String reversedString = new String(charArray);
        System.out.println("Reversed string: " + reversedString);
        scanner.close();
    }
}
