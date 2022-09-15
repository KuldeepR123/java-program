package com.example.classObjectsExercise;

public class Division extends ArithmeticOperation {
    @Override
    void perform(int x, int y) {
        System.out.println("Division of two numbers are : " + (x / y));
    }
}
