package com.example.practice;

import java.util.*;

public class SortMapByValues {
    public static void main(String[] args) {
        Map<Integer,String> name = new HashMap<>();
        name.put(1,"Kuldeep");
        name.put(2,"AP");
        name.put(3,"Yash");
        name.put(4,"Paras");
        name.put(5,"Niraj");

        List<Map.Entry<Integer,String>>sorted = new ArrayList<>(name.entrySet());
        System.out.println(sorted);
        sorted.sort((v1,v2)->v1.getValue().compareTo(v2.getValue()));
//        sorted.sort(Map.Entry.comparingByValue());

        Map<Integer,String> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,String>entry:sorted){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(sortedMap);
    }
}
