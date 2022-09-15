package com.example.collectionExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class CollectionExercise1 {
    static void arrayList(){
        ArrayList<String> person = new ArrayList<>();
        person.add("Kuldeep");
        person.add("Rohit");
        person.add("Ankit");
        person.add("Ronak");
        person.add("Harsh");

        System.out.println("PersonList");
        for(String s:person){
            System.out.println(s);
        }
        System.out.println();
    }
    static void arrayList1(){
        ArrayList<String> city = new ArrayList<>();
        city.add("Mumbai");
        city.add("Chennai");
        city.add("Delhi");
        city.add("Kolkata");
        city.add("Bangalore");

        System.out.println("CityList");
        for (String s:city
        ) {
            System.out.println(s);
        }
        System.out.println();
    }
    static void swapElements(ArrayList<Integer> num){
        Collections.swap(num,1,3);
        System.out.println("SwapElements");
        for (int n:num
        ) {
            System.out.println(n);
        }
        System.out.println();
    }
    static void joinArrayLists(ArrayList<Integer> numberList){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(10);

        numberList.addAll(number);
        ArrayList<Integer> duplicates = new ArrayList<>();
        int duplicate = 0;
        for(int i=0; i<numberList.size(); i++){
            for(int j=0;j<numberList.size(); j++){
                if((i!=j && Objects.equals(numberList.get(i), numberList.get(j))) && !duplicates.contains(numberList.get(i)) ){
                    duplicate+=1;
                    duplicates.add(i);
                }
            }
        }
        System.out.println("Number of duplicates are : " + duplicates.size());
        System.out.println();
    }

    static void removeDuplicates(ArrayList<Integer> list1){
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> newlist = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(10);

        list1.addAll(number);
        ArrayList<Integer> duplicates = new ArrayList<>();
        for(int n:list1){
            if(!newlist.contains(n)){
                newlist.add(n);
            }
        }
        System.out.println("After removing duplicates from list1");
        for (int n:newlist){
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println();
        arrayList();
        arrayList1();
        joinArrayLists(numbers);
        swapElements(numbers);
        removeDuplicates(numbers);
    }
}