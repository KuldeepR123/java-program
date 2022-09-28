package com.example.database;

import java.sql.*;

public class SelectData {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb",
                "kuldeep", "kuldeep@123");Statement stmt = conn.createStatement()) {
            conn.setAutoCommit(false);
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM trainee ORDER BY TraineeDOB DESC,TraineeJoiningDate DESC");
            while (resultSet.next()) {
                int id = resultSet.getInt("TraineeId");
                String name = resultSet.getString("TraineeName");
                String address = resultSet.getString("TraineeAddress");
                String dob = resultSet.getString("TraineeDOB");
                String joiningDate = resultSet.getString("TraineeJoiningDate");
                int age = resultSet.getInt("TraineeAge");
                System.out.println(id + " : " + name + " : " + address + " : " + dob + " : " + joiningDate + " : " + age);
            }
            resultSet.close();
            } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
