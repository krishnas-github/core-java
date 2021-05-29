package com.mycompany.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {
    public static void main(String[] args){
        String dbURL= "jdbc:mysql://localhost:3306/foodapp";
        String username ="root";
        String password = "";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL,username,password);
            String sql = "UPDATE users SET password=?, fullname=?, email=?, username=? WHERE user_id=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,"123456789");
            statement.setString(2,"William John");
            statement.setString(3,"William.john@gmail.com");
            statement.setString(4, "john");
            statement.setInt(5,4);

            int rowsUpdated = statement.executeUpdate();
            if(rowsUpdated>0){
                System.out.println("An existing user was updated successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
