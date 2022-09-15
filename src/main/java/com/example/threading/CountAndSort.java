package com.example.threading;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountAndSort {
    public void getCountAndSort() {
        synchronized (this) {
            Map<Integer, Integer> divisors = new LinkedHashMap<Integer, Integer>();
            Map<Integer, Integer> sortedDivisors = new LinkedHashMap<Integer, Integer>();
            for (int i = 1; i < 10001; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count += 1;
                    }
                }
                divisors.put(i, count);
                System.out.println(i + " have " + count + " divisors ");
            }
            System.out.println();
            divisors.entrySet().stream()
                    .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                    .forEachOrdered(k -> sortedDivisors.put(k.getKey(), k.getValue()));

            System.out.println("Number " + sortedDivisors.keySet().toArray()[0] + " have largest numbers of divisors ");
        }
    }
}
