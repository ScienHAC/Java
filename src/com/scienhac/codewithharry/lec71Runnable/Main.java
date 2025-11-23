package com.scienhac.codewithharry.lec71Runnable;

class MyThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyThread1 is running " + i);
        }
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyThread2 is running " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread1 bullet1 = new MyThread1();
        Thread gun1 = new Thread(bullet1);// they will give us the start method
        MyThread2 bullet2 = new MyThread2();
        Thread gun2 = new Thread(bullet2);
        Thread gun3 = new Thread(bullet2);
        Runnable bullet4 = () -> { // it work only with functional interface and these is lambda expression
            for (int i = 1; i <= 5; i++) {
                System.out.println("MyThread3 is running " + i);
            }
        };
        Runnable bullet5 = new Runnable() { //it can use any interface but all methods should be implemented
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("MyThread4 is running " + i);
                }
            }
        };
        Thread gun4 = new Thread(bullet4, "Gun-4");
        Thread gun5 = new Thread(bullet5, "Gun-5");
        gun4.start();
//        bullet`.start(); not works because start method is not in Runnable interface
        gun1.start();
        gun2.start();
        System.out.println("sdfsdfsdffsdfsdfsdfsdfsdfsdfd");
        System.out.println("sdfsdfsdffsdfsdfsdfsdfsdfsdfd");
        System.out.println("sdfsdfsdffsdfsdfsdfsdfsdfsdfd");
        for (int i = 0; i < 3; i++)
            System.out.println("Main thread is running " + i);
        gun3.start();
//        gun2.start();
        // see we name gun and bullet to understand the concept better
//        bullet2.start();
    }
}
