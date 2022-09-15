package com.example.arraysExercise;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<20; i++){
            numbers.add(i);
        }
        for(int n:numbers){
            System.out.print(n + " ");
        }
    }
}
