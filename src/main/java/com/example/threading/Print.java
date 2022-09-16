package com.examples.threading;

public class Print {
    int count = 1;
    static int n = 1000;

    public void odd() {
        synchronized (this) {
            while (count < n) {
                while (count % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " --> " + count);
                count++;
                notify();
            }
        }
    }

    public void even() {
        synchronized (this) {
            while (count < n) {
                while (count % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " --> " + count);
                count++;
                notify();
            }
        }
    }
}
