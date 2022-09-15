package com.example.inheritanceExercise;

public class Inheritance {
    public static void main(String[] args){
        Employee employee = new Employee("Kuldeep",22,123456,"Rajkot",1000,"Machine Learning");
        Manager manager = new Manager("KD",30,1234567,"Gujarat",20000,"Computer Science");
        employee.print();
        manager.print();
    }
}
