package com.examples.threading;

public class EvenNumber implements Runnable {
    Print print;

    EvenNumber(Print print) {
        this.print = print;
    }

    public void run() {
        print.even();
    }
}
