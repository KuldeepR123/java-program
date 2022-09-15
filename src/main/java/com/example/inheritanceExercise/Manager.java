package com.example.inheritanceExercise;

public class Manager extends Member {
    String department;

    Manager(String name, int age, long phone_number, String address, int salary, String department) {
        super(name, age, phone_number, address, salary);
        this.department = department;
    }

    void print() {
        System.out.println(name + " :" + age + " : " + phone_number + " : " + address + " : " + salary + " : " + department);
    }
}
