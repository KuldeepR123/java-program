package com.example.dataStructure;

import java.util.*;
public class TreeSett {
    public static void main(String[] args) {
        Set<String> city = new TreeSet<>(List.of("Mumbai",
                "Chennai",
                "Delhi",
                "Kolkata",
                "Ahmedabad",
                "Rajkot",
                "Vadodara",
                "Rajkot",
                "Bengaluru",
                "Mumbai"));
        System.out.println("TreeSet contain particular value "  + " : "+ city.contains("Pune"));
        System.out.println("TreeSet is empty or not " + " : " + city.isEmpty());
        System.out.println("Size of TreeSet is " + " : " + city.size());
        System.out.println("Before Removing");
        System.out.println(city);
        city.remove("Delhi");
        System.out.println("After Removing");
        System.out.println(city);
    }
}
