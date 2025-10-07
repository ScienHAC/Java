package com.krmu.day_07_oct.Palindrome;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String a = sc.next();
        boolean isPalindrome = false;
        int left = 0, right = a.length()-1;
        while(left<right){
            if(a.charAt(left)==a.charAt(right)){
                isPalindrome = true;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
