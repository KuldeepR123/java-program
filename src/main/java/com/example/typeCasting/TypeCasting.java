package com.example.typeCasting;

public class TypeCasting {
    public static void main(String[] args){
        System.out.println("Widening Casting : ");
        int a = 20;
        double b = a;
        System.out.println("b is : " + b);
        System.out.println("Narrowing Casting : ");
        double c = 20.789;
        int d = (int)(c);
        System.out.println("d is : " + d);
    }
}
