package com.example.controlStatementsExercise;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        if((n!=1) || n%2!=0){
            int m = n/2;
            for(int i=0; i<n; i++){
                int v = (i<m+1)?m+1-i:i-m+1;
                System.out.print("*");
                for(int j=0; j<v; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<v; j++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
}
