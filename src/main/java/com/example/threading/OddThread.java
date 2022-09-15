package com.example.threading;

public class OddThread extends Thread {
    public OddThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " --> " + i);
            }
        }
    }
}
