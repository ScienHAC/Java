package com.krmu.day_07_oct;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 integers:");
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
//            or
//            if(i==0){max = arr[0], arr[0]} for min and max
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        sc.close();
    }
}
