package com.example.string_exercise;
import java.util.Scanner;

public class StringExercise {
    static void stringBuffer(StringBuffer name){
        name.setCharAt(5,'a');
        System.out.println(name.toString());
    }
    static void stringBuilder(StringBuilder name1){
        name1.setCharAt(5,'a');
        System.out.println(name1.toString());
    }
    static void removeWhitespace(StringBuilder mynamee){
        for(int i=0;i<mynamee.length();i++){
            if (mynamee.charAt(i) == ' ') {
                mynamee.replace(i,i+1,"");
            }
        }
        System.out.println(mynamee.toString());
    }
    static void reverseString(String s){
        int n = s.length()-1;
        while(n>=0){
            System.out.print(s.charAt(n));
            n-=1;
        }
    }
    static int subStrings(String str, String sub) {
        if (str.length() < sub.length())
            return 0;
        if (str.equals(sub))
            return str.length();

        if (str.length() < 2) {
            if (str.contains(sub)) {
                return str.length();
            }
            return 0;
        }
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }
        if (str.startsWith(sub)) {
            return subStrings(str.substring(0, str.length() - 1), sub);
        }
        if (str.endsWith(sub))
            return subStrings(str.substring(1), sub);
        return subStrings(str.substring(1, str.length() - 1), sub);

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringBuffer name = new StringBuffer("abcdefghij");
        StringBuilder name_ = new StringBuilder("abcdefghi");

        String string = "abcde";
        String str,str1,str2;
        System.out.println("Enter a string to remove whitespace");
        str2 = scan.nextLine();
        StringBuilder myname = new StringBuilder(str2);
        System.out.println("Enter a string ");
        str = scan.nextLine();
        System.out.println("Enter s substring");
        str1 = scan.nextLine();
        stringBuffer(name);
        stringBuilder(name_);
        removeWhitespace(myname);
        reverseString(string);
        System.out.println(subStrings(str,str1));
    }
}
