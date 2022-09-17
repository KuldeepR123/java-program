package com.examples.threading;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TraverseDirectory {
    public static void main(String[] args){
//        File[] file = new File("/home/pp-2/Desktop/Kuldeep/Files").listFiles();
        ReadFiles readFiles = new ReadFiles();
        for(int i=0; i<2; i++){
            Files files = new Files(readFiles);
            files.start();
        }
    }
}
