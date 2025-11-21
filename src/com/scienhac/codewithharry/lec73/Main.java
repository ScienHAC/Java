package com.scienhac.codewithharry.lec73;

class ThreadDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

class MyThread extends Thread {
//    @Override
//    public void run() {
//        System.out.println("Thread is running");
//    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread("Piyush");
        MyThread x1 = new MyThread();
        MyThread x2 = new MyThread();
//        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(x1.getName());
        x1.setName("Alpha");
        System.out.println(x1.getName());
        System.out.println(x2.getName());
        ThreadDemo d1 = new ThreadDemo();
        Thread t3 = new Thread(d1, "DemoThread");
        t3.start();
        System.out.println(t3.getName());
        System.out.println(t3.getId());
    }
}
