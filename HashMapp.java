package com.example.dataStructure;

import java.util.HashMap;

public class HashMapp {
    public static void main(String[] args) {
        HashMap<Integer,String> name = new HashMap<>();
        name.put(1,"Kuldeep");
        name.put(2,"Yash");
        name.put(3,"Ankit");
        name.put(4,"Ronak");
        name.put(5,"Niraj");

        for(int i=0; i<name.size();i++){
            System.out.println(i+1 +" : " + name.get(i+1));
        }
        System.out.println("Hashmap is empty or not " + " : " + name.isEmpty());
        System.out.println("Before Removing");
        System.out.println(name);
        name.remove(3);
        System.out.println("After Removing");
        System.out.println(name);

    }
}
