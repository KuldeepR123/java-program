package com.example.threading;

public class ThreadExercise2{
    public static void main(String[] args) {
        Print print = new Print();
        OddThreads oddThreads = new OddThreads(print);
        EvenThreads evenThreads = new EvenThreads(print);
        Thread t1 = new Thread(evenThreads);
        oddThreads.start();
        t1.start();
    }
}