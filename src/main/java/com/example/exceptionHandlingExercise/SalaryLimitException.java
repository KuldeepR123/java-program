package com.example.exceptionHandlingExercise;

public class SalaryLimitException extends Exception {
    @Override
    public String toString() {
        return "Salary more than 87000 is not allowed";
    }
}
