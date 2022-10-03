package com.example.filesHandling;

import java.io.*;
import java.util.Objects;

public class EvenOddNumber {
    public static void filterNumber() {
//        !Objects.equals(strings[0], "")) &&
        try(FileReader fileReader = new FileReader("/home/pp-2/Desktop/Kuldeep/testK.txt");FileWriter odd = new FileWriter("odd.txt");
            FileWriter even = new FileWriter("even.txt");BufferedWriter bufferedWriter = new BufferedWriter(odd);
            BufferedWriter bufferedWriter1 = new BufferedWriter(even);){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split("\\s|,|\\.|-");

                if (!Objects.equals(line,"")) {
                    if (Integer.parseInt(strings[0]) % 2 != 0) {
                        bufferedWriter.write((strings[0]));
                        bufferedWriter.write("\n");
                    } else {
                        bufferedWriter1.write(strings[0]);
                        bufferedWriter1.write("\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
