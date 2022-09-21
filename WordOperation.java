package com.example.lambdaExpression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordOperation {
    WordOperation() {
        Scanner scan = new Scanner(System.in);
        try {
            FileReader fileReader = new FileReader("/home/pp-2/Desktop/Kuldeep/Files/file1.txt");
            StringBuffer sb = new StringBuffer();

            try (BufferedReader bf = new BufferedReader(fileReader)) {
                String line;
                while ((line = bf.readLine()) != null) {
                    sb.append(line);
                }
            }
//            Count Number of words in file
            int count = 0;
            for (int i = 0; i < sb.length(); i++) {
                if ((sb.charAt(i) == ' ') || (sb.charAt(i) == ',') || (sb.charAt(i) == '.')) {
                    count++;
                }
            }
            //Split words into arraylist
            List<String> word = Arrays.asList(sb.toString().split("\\s|,|\\.|-"));

            ArrayList<String> filterWordByLength = new ArrayList<>();

            //Unique words from list
            Set<String> uniqueWord = new LinkedHashSet<>(word);

            //filter words which length is less than 3
            for (String s : word) {
                if (s.length() < 3) {
                    filterWordByLength.add(s);
                }
            }
            //sort list of word in ascending order
            word.sort(Comparator.comparingInt(String::length));

            Map<Character, Integer> countChar = new HashMap<>();
            Map<Character, Integer> sortedCharacterCount = new HashMap<>();

            String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String smallLetters = "abcdefghijklmnopqrstuvwxyz";

            // To calculate number of occurrences which starts with A,a, B,b...Z,z.
            for (int i = 0; i < word.size(); i++) {
                int charCounter = 0;
                for (int j = 0; j < 26; j++) {
                    if (word.get(i).charAt(0) == capitalLetters.charAt(j) || word.get(i).charAt(0) == smallLetters.charAt(j)) {
                        charCounter++;
                        if (!(countChar.containsKey(word.get(i).charAt(0)))) {
                            countChar.put(word.get(i).charAt(0), charCounter);
                        } else {
                            countChar.put(word.get(i).charAt(0), (countChar.get(word.get(i).charAt(0)) + 1));
                        }
                        break;
                    }
                }
            }
            // sort the occurrences of character by value
            List<Map.Entry<Character, Integer>> entries = new ArrayList<>(countChar.entrySet());
            entries.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

            for (Map.Entry<Character, Integer> entry : entries) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //User input string and count words.
        String str;
        System.out.println("Enter a string");
        str = scan.nextLine();
        List<String> userInputWord = Arrays.asList(str.toString().split("\\s|,|\\.|-|\\?|"));
        Set<String> uniqueCount = new HashSet<>(userInputWord);
        int wordCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == ' ') || (str.charAt(i) == ',') || (str.charAt(i) == '.' || (str.charAt(i) == '?'))) {
                wordCount++;
            }
        }
    }
}
