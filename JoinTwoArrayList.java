package com.example.practice;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of(11,12,13,14,15,16,17,18,19,20));

        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
    }
}
