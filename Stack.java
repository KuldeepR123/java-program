package com.example.practice;

public class Stack {
    static int top=0;
    static int[] push = new int[5];
    public static void push(int data){
        push[top] = data;
        top++;
    }
    public static void show(){
        for(int i=0; i< push.length;i++){
            System.out.println(push[top-1]);
            top--;
        }
    }
    public static void main(String[] args) {
        //pop, peek, show, remove
        Stack.push(25);
        Stack.push(26);
        Stack.push(27);
        Stack.push(28);
        Stack.push(29);
        Stack.show();
    }
}
