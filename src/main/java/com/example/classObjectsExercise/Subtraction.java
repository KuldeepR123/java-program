package com.example.classObjectsExercise;

public class Subtraction extends ArithmeticOperation {
    @Override
    void perform(int x, int y) {
        System.out.println("Subtraction of two numbers are : " + (x - y));
    }
}
