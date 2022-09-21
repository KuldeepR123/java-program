package com.examples.threading;

public class Even implements Runnable {
    public void run() {
        synchronized (this) {
            int count = 2;
            while (count <= 1000) {
                System.out.println(count);
                count += 2;
            }
        }
    }
}
