package com.example.methodsExercise;

import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
public class Methods {
    static int parse(String s){
        return Integer.parseInt(s);
    }
    static void fineCalculate(String actualDay, String actualMonth, String actualYear, String returnedDate,
                              String returnedMonth, String returnedYear)
    {
        String expected = String.format("%s-%s-%s",actualYear,actualMonth,actualDay);
        String returned = String.format("%s-%s-%s",returnedYear,returnedMonth,returnedDate);

        LocalDate expect = LocalDate.parse(expected);
        LocalDate returns = LocalDate.parse(returned);

        long noOfDaysBetween = ChronoUnit.DAYS.between(expect, returns);

        if (parse(actualYear) > parse(returnedYear)) {
            System.out.println("10000 Hackos");
        } else if ((parse(returnedMonth) > parse(actualMonth) && parse(returnedMonth) <= 12) && (returnedYear.equals(actualYear))) {
            System.out.println("The fine = " + (500 * noOfDaysBetween));
        } else if (((parse(returnedDate) > parse(actualDay)) && (parse(actualDay) <= 30)) && ((returnedMonth.equals(actualMonth)) && (returnedYear.equals(actualYear)))) {
            System.out.println("The fine is = " + 15 * noOfDaysBetween);
        }
        else {
            System.out.println("No fine, Have a nice day ");
        }
    }

    public static void main(String[] args){
        String[] actuallyReturnDate;
        String[] returnedDate;
        String actualDay;
        String actualMonth;
        String actualYear;
        String returnDay;
        String returnMonth;
        String returnYear;
        Scanner scan = new Scanner(System.in);
        System.out.println("Pass from here");
        actuallyReturnDate = scan.nextLine().split(" ");
        System.out.println();
        returnedDate = scan.nextLine().split(" ");
        actualDay = actuallyReturnDate[0].length()==1?"0"+actuallyReturnDate[0]:actuallyReturnDate[0];
        actualMonth = actuallyReturnDate[1].length()==1?"0"+actuallyReturnDate[1]:actuallyReturnDate[1];
        actualYear = actuallyReturnDate[2];
        returnDay =  returnedDate[0].length()==1?"0"+returnedDate[0]:returnedDate[0];
        returnMonth =  returnedDate[1].length()==1?"0"+returnedDate[1]:returnedDate[1];
        returnYear = returnedDate[2].length()==1?"0"+returnedDate[2]:returnedDate[2];

        fineCalculate(actualDay, actualMonth, actualYear, returnDay, returnMonth, returnYear);
    }
}
