package com.example.serialization_exercise;

import java.io.Serializable;

public class Student implements Serializable {
    int age;

    Student(int age) {
        this.age = age;
    }
}
