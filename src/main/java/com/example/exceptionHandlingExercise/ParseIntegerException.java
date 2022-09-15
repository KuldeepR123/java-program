package com.example.exceptionHandlingExercise;

public class ParseIntegerException extends Exception {
    public String toString() {
        return "Invalid Elasticsearch port configuration";
    }
}
