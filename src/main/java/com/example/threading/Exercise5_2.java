package com.examples.threading;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Exercise5_2 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        Print print = new Print();
        OddNumber oddNumber = new OddNumber(print);
        EvenNumber evenThreads = new EvenNumber(print);
        threadPoolExecutor.execute(oddNumber);
        threadPoolExecutor.execute(evenThreads);
        threadPoolExecutor.shutdown();
    }
}
