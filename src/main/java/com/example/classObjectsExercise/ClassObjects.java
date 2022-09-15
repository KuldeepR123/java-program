package com.example.classObjectsExercise;

import java.util.Scanner;

public class ClassObjects {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int n;

        firstNumber = Integer.parseInt(args[0]);
        secondNumber = Integer.parseInt(args[1]);
        System.out.println("Please choose the number between 1 to 4: ");
        System.out.println("1 -> Addition, 2 -> Subtraction, 3 -> Multiplication, 4 -> Division");
        n = scan.nextInt();
//        if(n>4){
//            throw new IllegalArgumentException(" Entered number " + n + " is greater than 4");
//        }
//        if(n<1){
//            throw new IllegalArgumentException("Entered number " + n + " is less than 1");
//        }
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        switch(n){
            case 1 -> addition.perform(firstNumber,secondNumber);
            case 2 -> subtraction.perform(firstNumber,secondNumber);
            case 3 -> multiplication.perform(firstNumber,secondNumber);
            case 4 -> division.perform(firstNumber,secondNumber);
            default -> System.out.println("Unexpected Value : " + n);
        }
    }
}
