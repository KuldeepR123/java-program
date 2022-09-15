package com.example.inheritanceExercise;

public class Employee extends Member {
    String specialization;

    Employee(String name, int age, long phone_number, String address, int salary, String specialization) {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
    }

    void print() {
        System.out.println(name + " :" + age + " : " + phone_number + " : " + address + " : " + salary + " : " + specialization);
    }
}
