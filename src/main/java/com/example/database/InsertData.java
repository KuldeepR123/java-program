package com.example.database;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class InsertData {
    public static void main(String[] args) {
        List<Information> multipleRecords = new LinkedList<>();
        multipleRecords.add(new Information(3,"Ankit","Rajkot","1998-05-24","2021-05-24",24));
        multipleRecords.add(new Information(4,"Yash","Rajkot","2000-07-21","2022-05-24",22));
        multipleRecords.add(new Information(5,"Niraj","Rajkot","1999-03-19","2021-05-25",24));
        multipleRecords.add(new Information(6,"Harsh","Rajkot","1999-07-24","2021-07-24",24));
        multipleRecords.add(new Information(7,"AP","Rajkot","2000-02-11","2022-04-17",22));

//        String sql = "INSERT INTO trainee (TraineeId,TraineeName,TraineeAddress, TraineeDOB, TraineeJoiningDate,TraineeAge) VALUES  (?,?,?,?,?,?);";
        String sql1 = "INSERT INTO trainee (TraineeId,TraineeName,TraineeAddress, TraineeDOB, TraineeJoiningDate,TraineeAge) VALUES  (?,?,?,?,?,?);";
        try(Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb",
                "kuldeep", "kuldeep@123");PreparedStatement stmt = conn.prepareStatement(sql1)){
            conn.setAutoCommit(false);
            for (Information m : multipleRecords) {
                stmt.setInt(1, m.TraineeId);
                stmt.setString(2, m.TraineeName);
                stmt.setString(3, m.TraineeAddress);
                stmt.setString(4, m.TraineeDOB);
                stmt.setString(5, m.TraineeJoiningDate);
                stmt.setInt(6, m.TraineeAge);
                stmt.executeUpdate();
                }
           /* stmt.setInt(1, 8);
            stmt.setString(2, "nas");
            stmt.setString(3, "Rajkot");
            stmt.setString(4, "2000-05-04");
            stmt.setString(5, "2022-06-08");
            stmt.setInt(6, 22);*/
            stmt.executeUpdate();
            conn.commit();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
