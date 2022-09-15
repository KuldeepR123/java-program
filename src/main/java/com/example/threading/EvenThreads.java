package com.example.threading;

public class EvenThreads implements Runnable {
    Print print;

    EvenThreads(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        print.even();
    }
}
