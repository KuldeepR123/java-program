package com.example.filesHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class NumberDatabase {
    public static void main(String[] args) {
        HashMap<Integer,Integer> number = new HashMap<>();
        try (FileReader fileReader = new FileReader("/home/pp-2/Desktop/Kuldeep/testK.txt");
             Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mytask","postgres", "kuldeep@123")) {
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE FrequencyOfNumbers " +
                    "(ID SERIAL PRIMARY KEY ," +
                    "Number INT NOT NULL ," +
                    "Frequency INT    NOT NULL)";
            stmt.execute(sql);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] strings;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split("\\s|,|\\.|-");
                int count=1;
                if (!Objects.equals(line, "")) {
                    if(!number.containsKey(Integer.parseInt(strings[2].substring(0,2)))){
                        number.put(Integer.parseInt(strings[2].substring(0,2)),count);
                    }
                    else {
                        number.put(Integer.parseInt(strings[2].substring(0,2)),number.get(Integer.parseInt(strings[2].substring(0,2)))+count);
                    }
                }
            }
            String odd = "INSERT INTO FrequencyOfNumbers (Number,Frequency) VALUES  (?,?);";
            for(Map.Entry<Integer,Integer> integerEntry : number.entrySet()){
                PreparedStatement pstmt = conn.prepareStatement(odd);
                pstmt.setInt(1,integerEntry.getKey());
                pstmt.setInt(2,integerEntry.getValue());
                pstmt.executeUpdate();
            }
            conn.commit();
        }
        catch (IOException | SQLException e){
            e.printStackTrace();
        }
    }
}
