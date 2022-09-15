package com.example.fileIOexercise;

import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class FileOperation{
    public static void createNewFile(){
        File file = new File("abc.txt");
        try{
            boolean isCreated = file.createNewFile();
            if(isCreated){
                System.out.println("File is created !");
            }
        }
        catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    public static void writeInFile(){
        try(FileOutputStream  fos = new FileOutputStream("abc.txt")){
            String str = "hello, this is kuldeep";
            fos.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void moveFile(){
        String source_path = "/home/pp-2/Desktop/Kuldeep/java-exercise/file2.txt";
        String destination_path = "/home/pp-2/Desktop/Kuldeep/file2.txt";
        Path result = null;
        try{
            result = Files.move(Paths.get(source_path), Paths.get(destination_path));
        }
        catch(IOException e){
            System.out.println("Error occurred in moving a file!");
            e.printStackTrace();
        }
    }
    public static void openExistingFile(){
        File file = new File("abc.txt");
        Desktop desktop = Desktop.getDesktop();
        try{
            if(file.exists()){
                desktop.open(file);
            }
        }
        catch(IOException e){
            System.out.println("An error occurred !");
            e.printStackTrace();
        }
    }
}
public class FileIoExercise2 {
    public static void main(String[] args) {
//        FileOperation.writeInFile();
//        FileOperation.moveFile();
        FileOperation.openExistingFile();
    }
}
