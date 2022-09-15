package com.example.threading;

public class OddThreads extends Thread {
    Print print;

    OddThreads(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        print.odd();
    }
}
