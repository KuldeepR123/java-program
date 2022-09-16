package com.examples.threading;

public class OddNumber extends Thread {
    Print print;

    OddNumber(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        print.odd();
    }
}
