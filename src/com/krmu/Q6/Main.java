package com.krmu.Q6;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Runnable evenTask = () -> {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
            }
        };

        Runnable oddTask = () -> {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
            }
        };

        Runnable sumTask = () -> {
            int sum = 0;
            for (int i = 1; i <= 20; i++) {
                sum += i;
            }
            System.out.println("Sum: " + sum);
        };

        Thread t1 = new Thread(evenTask, "EvenThread");
        Thread t2 = new Thread(oddTask, "OddThread");
        Thread t3 = new Thread(sumTask, "SumThread");

        System.out.println("Starting threads...");
        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();

        System.out.println("All threads finished.");
    }
}
