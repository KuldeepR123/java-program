package com.example.threading;

public class ThreadExercise1{
    public static void main(String[] args) {
        OddThread oddThread = new OddThread("Odd Thread");
        EvenThread evenThread = new EvenThread();
        Thread thread = new Thread(evenThread, "Even Thread");
        oddThread.start();
        thread.start();
    }
}