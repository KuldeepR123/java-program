package com.examples.threading;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Exercise5_1 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        Odd odd = new Odd();
        Even even = new Even();
        threadPoolExecutor.execute(odd);
        threadPoolExecutor.execute(even);
        threadPoolExecutor.shutdown();
    }
}
