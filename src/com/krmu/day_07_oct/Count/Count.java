package com.krmu.day_07_oct.Count;
import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String a = sc.nextLine();
        int vowelCount = 0, consonantCount = 0, spaceCount = 0, digitCount = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                vowelCount++;
            }else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                consonantCount++;
            }else if(ch==' '){
                spaceCount++;
            }else if(ch>='0' && ch<='9'){
                digitCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Digits: " + digitCount);
        sc.close();
    }
}
