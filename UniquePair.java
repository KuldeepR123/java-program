package com.example.dataStructure;

public class UniquePair {
    public static void main(String[] args) {
        int count=0;
        int[] number = {1,2,3,4,5,6,7,8,9,10};
        for (int k : number) {
            for (int i : number) {
                if (k < i) {
                    count += 1;
                    System.out.println("(" + k + "," + i + ")");
                }
            }
        }
        System.out.println("count of unique pairs (number[i], number[j])" + " : " + count);
    }
}
