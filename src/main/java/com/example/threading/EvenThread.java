package com.example.threading;

public class EvenThread implements Runnable {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(Thread.currentThread().getName() + " --> " + i);
            }
        }
    }
}
