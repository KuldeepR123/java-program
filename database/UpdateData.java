package com.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
//        String sql = "UPDATE trainee SET TraineeJoiningDate=? WHERE TraineeId=?";
        String sql = "DELETE FROM trainee WHERE TraineeName LIKE 'n%' AND TraineeName LIKE '%s'";
        try(Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb",
                "kuldeep", "kuldeep@123");PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                conn.setAutoCommit(false);
                preparedStatement.executeUpdate();
                conn.commit();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
