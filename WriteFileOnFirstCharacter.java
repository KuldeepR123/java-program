package com.example.filesHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class WriteFileOnFirstCharacter {
    public static void writefile(){
        try(FileReader fileReader = new FileReader("/home/pp-2/Desktop/Kuldeep/testK.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);){
            String line;
            String[] strings;
            while ((line=bufferedReader.readLine())!=null){
                strings = line.split("\\s|,|\\.|-");

                if(!Objects.equals(line,"")){
                    File file = new File(strings[1].charAt(0)+".txt");
                    FileWriter fileWriter = new FileWriter(file,true);
                    if(file.exists()){
                        fileWriter.write(strings[1]);
                        fileWriter.write("\n");
                    }
                    else if(file.createNewFile()){
                        fileWriter.write(strings[1]);
                        fileWriter.write("\n");
                    }
                    fileWriter.close();
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
