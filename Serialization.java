package com.example;


import java.io.*;

class Serilizations implements Serializable{
    public int number1;
    Serilizations(int number1){
        this.number1 = number1;
    }
}
public class Serialization {
    public static void main(String[] args){
        Serilizations serilizations = new Serilizations(22);
        try{
            FileOutputStream fos = new FileOutputStream("object.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(serilizations);
            fos.close();
            oos.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
