package com.scienhac.codewithharry.lec75Join;
/*
Thread join is actually pausing the execution of the main thread until the thread on which join is called is completed. but it not pause the execution of other threads, that already in the runnable state so think like we can use join and call after the start method of a thread so that the main thread will wait for that thread to finish its execution before moving on to the next line of code.
 */

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running using join: ");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running without join 1: ");
            try {
                // we need to use try catch because sleep method can throw InterruptedException
                Thread.sleep(2000);
                // thread sleep is used to pause the execution of the thread for specified milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running without join 2: ");
        }
    }
}

class MyThread4 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running without join 3: ");
        }
    }
}

public class ThreadJoin {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        MyThread4 t4 = new MyThread4();

        t1.start();
        t2.start();
        t3.start();
        System.out.println("Main thread is finished. 1 ");
        try {
            t1.join(); // Main thread will wait for t1 to finish or say main function will wait for t1 to finish and not go to next line until t1 is finished
            // it can through exception that's why try catch is used
            //Exception are those error which can be handled but error are those which can not be handled like OutOfMemoryError
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is finished. 2 ");
        System.out.println("Main thread is finished. 3");
        System.out.println("Main thread is finished. 3");
        System.out.println("Main thread is finished. 3");
        t4.start();
    }
}
