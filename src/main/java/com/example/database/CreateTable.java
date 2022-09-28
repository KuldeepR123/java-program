package com.example.database;
import java.sql.*;
public class CreateTable {
    public static void main(String[] args) {
        try( Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb",
                "kuldeep", "kuldeep@123");Statement stm = conn.createStatement();){
            String sql = "CREATE TABLE Trainee " +
                    "(TraineeId INT PRIMARY KEY     NOT NULL," +
                    " TraineeName           TEXT    NOT NULL, " +
                    " TraineeAddress            TEXT     NOT NULL, " +
                    " TraineeDOB        TEXT, " +
                    " TraineeJoiningDate         TEXT, " +
                    "TraineeAge    INT)";
            stm.execute(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
