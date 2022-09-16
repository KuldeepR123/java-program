package com.examples.threading;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Exercise5_3 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
        CountAndSort countAndSort = new CountAndSort();
        GetCountDivisors getCountDivisors =  new GetCountDivisors(countAndSort);
        threadPoolExecutor.execute(getCountDivisors);
        threadPoolExecutor.shutdown();
    }
}
