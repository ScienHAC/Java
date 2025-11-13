package com.krmu.Assignment3;

class OddEvenPrinter {
    private boolean isOddTurn = true;

    synchronized void printOdd(int num) {
        while (!isOddTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Odd: " + num);
        isOddTurn = false;
        notify();
    }

    synchronized void printEven(int num) {
        while (isOddTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Even: " + num);
        isOddTurn = true;
        notify();
    }

    public void run() {
        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) {
                printOdd(i);
            }
        });

        Thread even = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                printEven(i);
            }
        });

        odd.start();
        even.start();

        try {
            odd.join();
            even.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

