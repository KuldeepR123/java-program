package com.examples.threading;

public class Odd extends Thread {
    @Override
    public void run() {
        synchronized (this) {
            int count = 1;
            while (count <= 1000) {
                System.out.println(count);
                count += 2;
            }
        }
    }
}
