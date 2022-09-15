package com.example.fileIOexercise;

import java.io.*;
import java.nio.charset.StandardCharsets;

class WriteExcelFile{
    public static void writeExcelFile(){
        try(BufferedWriter bfw= new BufferedWriter(new OutputStreamWriter(new FileOutputStream("abc.csv"), StandardCharsets.UTF_8))){
            bfw.append("Hello\n");
            bfw.write("Kuldeep\n");
            bfw.write("Harsh\n");
            bfw.write("123");
            bfw.flush();
        }
        catch(IOException e){
            System.out.println("An Error Occurred !");
            e.printStackTrace();
        }
    }
    public static void readExcelFile(){
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream("abc.csv"),StandardCharsets.UTF_8))){
            String str;
            while ((str = bfr.readLine()) != null) {
                System.out.println(str);
            }
        }
        catch(IOException e){
            System.out.println("An Error Occurred !");
        }
    }
}
public class FileIoExercise3 {
    public static void main(String[] args) {
//        WriteExcelFile.writeExcelFile();
        WriteExcelFile.readExcelFile();
    }
}
