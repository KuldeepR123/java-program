package com.example.serialization_exercise;

import java.io.*;

public class Serializations {
    static void writeObject(Student obj)throws Exception{
        File f = new File("serializable.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        fos.close();
        oos.close();
    }
    static void writeObjectInheritance(Employer emp)throws Exception{
        File f = new File("serialize.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(emp);
        fos.close();
        oos.close();
    }
    static void readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("serializable.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student obj1 = (Student)ois.readObject();
        System.out.println(obj1.age);
        fis.close();
        ois.close();
    }
    public static void main(String[] args) throws Exception {
        Student obj = new Student(20);
        Employer emp = new Employer(22,10000);
        writeObject(obj);
        writeObjectInheritance(emp);
        readObject();
    }
}
