package com.course.thirdDay;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        System.out.println("Traffic Light Simulation enter choice to change color: ");
        Scanner sc = new Scanner(System.in);
        int lightColor = sc.nextInt();

        switch (lightColor) {
            case 1:
                System.out.println("Go");
                break;
            case 2:
                System.out.println("Slow down");
                break;
            case 3:
                System.out.println("Stop");
                break;
            default:
                System.out.println("Invalid color");
        }
    }
}
