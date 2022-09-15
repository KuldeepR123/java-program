package com.example.inheritanceExercise.pkg2;
import com.example.inheritanceExercise.pkg1.Package1;

public class Package2 {
    public static void main(String[] args){
        Package1 mat = new Package1();
        mat.display();
        mat.a =10;
        mat.b = 5;
        System.out.println(mat.a + mat.b);
        System.out.println(mat.a - mat.b);
        System.out.println(mat.a * mat.b);
        System.out.println(mat.a / mat.b);
    }
}
