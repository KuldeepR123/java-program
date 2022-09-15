package com.example.regularExpression_exercise;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegularExpression {
    static void patternMatch(String pattern, String[] patterns){
        Pattern pat = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        for (String s : patterns) {
            Matcher mat = pat.matcher(s);
            boolean matchFound = mat.find();
            if (matchFound) {
                System.out.println("Pattern Matched");
            } else {
                System.out.println("Pattern doesn't match");
            }
        }
    }
    public static void emailMatch(String mail) {
        char[] chars = mail.toCharArray();
        String regx = "^[a-zA-Z0-9]+@gmail.com$";
        Pattern pat = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
        Matcher match = pat.matcher(mail);
        boolean matchFound = match.find();
        int count = 0;

        for (char c : chars) {
            if (Character.isDigit(c)) {
                count += 1;
            }
        }
        if (count > 0 && matchFound) {
            System.out.println("Email Matched !");
        } else {
            System.out.println("Email doesn't match !");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] patterns = {"abcdefg", "abcde", "abc"};
        String pattern;
        String email;
        System.out.println("Enter a String");
        pattern = scan.nextLine();
        email = scan.nextLine();
        patternMatch(pattern, patterns);
        emailMatch(email);
    }
}
