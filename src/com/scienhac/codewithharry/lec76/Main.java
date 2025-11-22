package com.scienhac.codewithharry.lec76;

class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getName());
    }
}
