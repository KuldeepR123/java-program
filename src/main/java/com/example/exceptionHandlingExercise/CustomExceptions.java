package com.example.exceptionHandlingExercise;

public class CustomExceptions extends Exception {
    public CustomExceptions() {
        super("Invalid Elastic Search Configuration");
    }

    public CustomExceptions(String strMessage) {
        super(strMessage);
    }
}
