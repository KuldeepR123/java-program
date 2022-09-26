package com.example.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayToSet {
    public static void main(String[] args) {
        Integer[] number = {1,2,3,4,5,6,7,8,1,2,3};
        Set<Integer> uniqueNumber = new HashSet<>(List.of(number));
        System.out.println(uniqueNumber);

        // converting set -> array
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(1);
        uniqueNumbers.add(2);
        uniqueNumbers.add(3);
        uniqueNumbers.add(4);
        Integer[] numbers = new Integer[uniqueNumbers.size()];
        uniqueNumbers.toArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
