package com.example.dataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Information {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Integer>details= new HashMap<>();
        details.put("Kuldeep",70431);
        details.put("Ankit",82000);
        details.put("Ronak",82658);
        details.put("Yash",78256);
        details.put("Niraj",98567);
        System.out.println(details);

        String name;
        name = scan.nextLine();
        if(details.containsKey(name)){
            System.out.println(name+"="+details.get(name));
        }
        else{
            System.out.println("Not Found !");
        }
    }
}
