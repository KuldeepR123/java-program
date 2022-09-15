package com.example.thisKeyword_exercise;

public class ThisKey {
    String name;
    int salary;
    int age;

    ThisKey(String name, int salary, int age) {
        this.name = name; //to differentiate instance variable and local variable
        this.salary = salary;
        this.age = age;
        this.information();
    }

    void information() {
        System.out.println(this.name + ":" + this.age + ":" + this.salary);
    }
}
