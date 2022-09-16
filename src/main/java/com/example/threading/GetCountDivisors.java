package com.examples.threading;

public class GetCountDivisors extends Thread {
    CountAndSort countAndSort;

    GetCountDivisors(CountAndSort countAndSort) {
        this.countAndSort = countAndSort;
    }

    @Override
    public void run() {
        countAndSort.getCountAndSort();
    }
}
