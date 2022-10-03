package com.example.filesHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CountFrequency {
    public static void count() {
        HashMap<Integer,Integer> number = new HashMap<>();
        try (FileReader fileReader = new FileReader("/home/pp-2/Desktop/Kuldeep/testK.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            String line;
            String[] strings;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split("\\s|,|\\.|-");
                int count=1;
                if (!Objects.equals(line, "")) {
                    if(!number.containsKey(Integer.parseInt(strings[2].substring(0,2)))){
                        number.put(Integer.parseInt(strings[2].substring(0,2)),count);
                    }
                    else {
                        number.put(Integer.parseInt(strings[2].substring(0,2)),number.get(Integer.parseInt(strings[2].substring(0,2)))+count);
                    }
                }
            }
            for(Map.Entry<Integer,Integer> integerEntry : number.entrySet()){
                System.out.println(integerEntry.getKey() + " -> " + integerEntry.getValue());
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
