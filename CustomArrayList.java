package com.example.practice;

import java.util.ArrayList;
import java.util.Comparator;

class City{
    int id;
    String name;
    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class SortByName implements Comparator<City>{
    @Override
    public int compare(City c1, City c2) {
        return c1.name.compareTo(c2.name);
    }
}
public class CustomArrayList {
    public static void main(String[] args) {
        ArrayList<City> cityArrayList = new ArrayList<>();
        cityArrayList.add(new City(1,"Rajkot"));
        cityArrayList.add(new City(2,"Ahmedabad"));
        cityArrayList.add(new City(3,"Mumbai"));
        cityArrayList.add(new City(4,"Delhi"));
        cityArrayList.add(new City(5,"Chennai"));
        cityArrayList.add(new City(6,"Surat"));

        cityArrayList.sort(new SortByName());
        for(City c:cityArrayList){
            System.out.println(c.id + " : " + c.name);
        }
    }
}
