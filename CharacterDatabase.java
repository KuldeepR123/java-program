package com.example.filesHandling;

import java.io.*;
import java.sql.*;
import java.util.Locale;
import java.util.Objects;

public class CharacterDatabase {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mytask",
                "postgres", "kuldeep@123"); FileReader fileReader = new FileReader("/home/pp-2/Desktop/Kuldeep/testK.txt")){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            DatabaseMetaData dbm =  conn.getMetaData();
            conn.setAutoCommit(false);
            Statement stm = conn.createStatement();
            String line;
            String[] strings;
            while ((line=bufferedReader.readLine())!=null){
                strings = line.split("\\s|,|\\.|-");

                if(!Objects.equals(line,"")){
                    ResultSet tables = dbm.getTables(null,null, String.valueOf(strings[1].charAt(0)).toLowerCase(Locale.ROOT), null);
                    if(!tables.next()){
                        String sql = String.format("CREATE TABLE %s", strings[1].charAt(0)) +
                                "(ID SERIAL PRIMARY KEY ," +
                                " Character TEXT    NOT NULL)";
                        stm.execute(sql);
                        String str = String.format("INSERT INTO %s (Character) VALUES  (?);",strings[1].charAt(0));
                        PreparedStatement pstmt = conn.prepareStatement(str);
                        pstmt.setString(1,String.valueOf(strings[1]));
                        pstmt.executeUpdate();
                    }
                    else{
                        String str = String.format("INSERT INTO %s (Character) VALUES  (?);",strings[1].charAt(0));
                        PreparedStatement pstmt = conn.prepareStatement(str);
                        pstmt.setString(1,String.valueOf(strings[1]));
                        pstmt.executeUpdate();
                    }
                }
                conn.commit();
            }
        }
        catch (SQLException | IOException e){
            e.printStackTrace();
        }
    }
}
