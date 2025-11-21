package com.scienhac.codewithharry.lec74;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) { // you can see the effect of priority only when the thread is in infinite loop or doing some heavy task
            System.out.println("MyThread is running " + this.getName());
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Piyush (custom Priority)");
        MyThread t2 = new MyThread("abc (High Priority)");
        MyThread t3 = new MyThread("xyz (Low Priority)");
        MyThread t4 = new MyThread("def (Normal Priority)");
        t2.setPriority(Thread.MAX_PRIORITY); // 10
        // by default all have normal priority 5
        t1.setPriority(7);
        t3.setPriority(Thread.MIN_PRIORITY);
        //t4.setPriority(Thread.NORM_PRIORITY);// it is 5 and it is by default so no need to set it
        System.out.println(t2.getPriority());
        System.out.println(t1.getPriority());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
