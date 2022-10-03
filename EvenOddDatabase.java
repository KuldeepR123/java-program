package com.example.filesHandling;

import com.example.database.Information;

import java.io.*;
import java.sql.*;
import java.util.Objects;

public class EvenOddDatabase {
    public static void main(String[] args) {
        /*try(Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mytask",
                "postgres", "kuldeep@123"); Statement stm = conn.createStatement();){
            String sql = "CREATE TABLE Even " +
                    "(ID SERIAL PRIMARY KEY ," +
                    " EvenNumber INT    NOT NULL)";
            stm.execute(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
        }*/
        try(FileReader fileReader = new FileReader("/home/pp-2/Desktop/Kuldeep/testK.txt");Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mytask",
                "postgres", "kuldeep@123")) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            conn.setAutoCommit(false);
            String odd = "INSERT INTO Odd (OddNumber) VALUES  (?);";
            String even = "INSERT INTO Even (EvenNumber) VALUES  (?);";
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split("\\s|,|\\.|-");

                if (!Objects.equals(line,"")) {
                    if (Integer.parseInt(strings[0]) % 2 != 0) {
                        PreparedStatement stmt = conn.prepareStatement(odd);
                        stmt.setInt(1,Integer.parseInt(strings[0]));
                        stmt.executeUpdate();
                    } else {
                        PreparedStatement stmt = conn.prepareStatement(even);
                        stmt.setInt(1,Integer.parseInt(strings[0]));
                        stmt.executeUpdate();
                    }
                }
                conn.commit();
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
