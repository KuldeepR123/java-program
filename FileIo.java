package com.example.filesHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileIo {
    public static void main(String[] args) {
//        ascii value for A-Z -> 65-90; for a-z -> 97-122
        try {
            FileReader fileReader = new FileReader("/home/pp-2/Desktop/Kuldeep/Files/file1.txt");
            StringBuffer sb = new StringBuffer();

            try (BufferedReader bf = new BufferedReader(fileReader)) {
                String line;
                while ((line = bf.readLine()) != null) {
                    sb.append(line);
                }
            }
            int count = 0;
            for (int i = 0; i < sb.length(); i++) {
                if ((sb.charAt(i) == ' ') || (sb.charAt(i) == ',') || (sb.charAt(i) == '.')) {
                    count++;
                }
            }
            List<String> word = Arrays.asList(sb.toString().split("\\s|,|\\.|-"));
            ArrayList<String> filterWordByLength = new ArrayList<>();
            Set<String> uniqueWord = new LinkedHashSet<>(word);
            for (String s : word) {
                if (s.length() < 3) {
                    filterWordByLength.add(s);
                }
            }
            System.out.println(word);

            Map<Character, Integer> countChar = new HashMap<>();
            Map<Character, Integer> sortedCharacterCount = new HashMap<>();
            String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String smallLetters = "abcdefghijklmnopqrstuvwxyz";

            for (int i = 0; i < word.size(); i++) {
                int charCounter = 0;
                for (int j = 0; j < 26; j++) {
                    if (word.get(i).charAt(0) == capitalLetters.charAt(j) || word.get(i).charAt(0) == smallLetters.charAt(j)) {
                        charCounter++;
                        if (!(countChar.containsKey(word.get(i).charAt(0)))) {
                            countChar.put(word.get(i).charAt(0), charCounter);
                        } else {
                            countChar.put(word.get(i).charAt(0), (countChar.get(word.get(i).charAt(0)) + charCounter));
                        }
                        break;
                    }
                }
            }
            Map<Character, Integer> characterIntegerMap = sortValues(countChar);
            System.out.println(characterIntegerMap);
            /*System.out.println(sortedCharacterCount);
            word.sort(Comparator.comparingInt(String::length)); //sort list of word in ascending order

            System.out.println();
            System.out.println("Number of words which size is less than three :  " + filterWordByLength.size());
            System.out.println("Number of Unique words : " + uniqueWord.size());
            System.out.println("Total Number of words in file : " + count);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Map<Character, Integer> sortValues(Map<Character, Integer> map) {
        LinkedList<Character> list = new LinkedList(map.entrySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return -((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        /*Collections.sort(list, (obj1, obj2) -> {
            return -map.get(obj1).compareTo(map.get(obj2));
        });*/

        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
}
