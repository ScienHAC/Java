package com.scienhac.codewithharry.lec69Multithread;

//Multithreading lets multiple tasks run independently; faster when tasks wait, parallel on multi-core, concurrent on single-core.
//Multithreading is best if you have multiple cores and tasks that can run independently, and mutlithreading speed can vary system to system it excellent in mutliple cores
//but single core system fail because single core can only run one task at a time so it will switch between tasks giving illusion of parallelism but in reality it is not parallelism
//actually if single core so what happen as in cpu at a time single instruction run in register and in older system it switch so we see elemnts but acutally it is illusion
//single core can be faster to that system whose single efficency core is powerful and the task is more cpu driven rather than multitasking like video editing software
//In multithreading java call thread one after another in a time slice manner so it switch between threads very fast giving illusion of parallelism
// like each next instruction or execution is return one after another by switching between threads
// like imagine threading example like i type something so a thread that display output realtime what i type other wise the whole output is pass and dispay and second thread which autosave my work in background
class Task1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 1 → " + i);
        }
    }
}

class Task2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 2 → " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        t1.start();
        t2.start();
    }
}
