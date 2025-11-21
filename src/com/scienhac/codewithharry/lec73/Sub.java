package com.scienhac.codewithharry.lec73;

class MyThread1 extends Thread {
    public MyThread1(String name) {
        super(name);
    }

    public MyThread1() {
        // default constructor
    }

    void changeName(String name) {
        // this method won't actually change the thread's name
        // because thread names are final after construction
        // but we can simulate it by creating a new thread with the new name
        this.setName(name); // This will not work as expected; thread names are set at construction
    }
}

public class Sub {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Piyush");
        MyThread1 t2 = new MyThread1();
        MyThread1 t3 = new MyThread1();
        System.out.println(t1.getName()); // Output: Piyush
        System.out.println(t2.getName()); // Output: Thread-0 (or similar default name)
        t2.changeName("alpha");
        System.out.println(t2.getName()); // Output: Thread-0 (name remains unchanged)
        System.out.println(t3.getName()); // Output: Piyush
        System.out.println(t1.getId());
    }
}
