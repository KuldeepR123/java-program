package com.example.serialization_exercise;

public class Employer extends Student {
    long salary;

    Employer(int age, long salary) {
        super(age);
        this.salary = salary;
    }
}
