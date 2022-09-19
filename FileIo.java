package com.example.filesHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileIo {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("/home/pp-2/Desktop/Kuldeep/Files/file1.txt");
            StringBuffer sb = new StringBuffer();
            try (BufferedReader bf = new BufferedReader(fileReader)) {
                String line;
                while ((line = bf.readLine()) != null) {
                    sb.append(line);
                }
            }
            int count=0;
            for(int i=0;i<sb.length();i++){
                if((sb.charAt(i)==' ') || (sb.charAt(i)==',') || (sb.charAt(i)=='.')){
                    count++;
                }
            }
            List<String> word = Arrays.asList(sb.toString().split("\\s|,|\\.|-"));
            ArrayList<String> filterWordByLength = new ArrayList<>();
            Set<String> uniqueWord = new HashSet<>(word);
            for (String s : word) {
                if (s.length() < 3) {
                    filterWordByLength.add(s);
                }
            }
            System.out.println(word);
            word.sort(Comparator.comparingInt(String::length)); //sort list of word in ascending order
            for(String s:word){
                System.out.println(s);
            }
            System.out.println();
            System.out.println("Number of words which size is less than three :  " + filterWordByLength.size());
            System.out.println("Number of Unique words : " + uniqueWord.size());
            System.out.println("Total Number of words in file : " + count);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
