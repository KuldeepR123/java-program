package com.example.threading;

public class Exercise4 {
    public static void main(String[] args) {
        CountAndSort countAndSort = new CountAndSort();
        GetCountDivisors getCountDivisors =  new GetCountDivisors(countAndSort);
        getCountDivisors.start();
    }
}
