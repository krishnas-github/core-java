package com.mycompany.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectDemo {
    public static void main(String[] args){
        String dbURL = "jdbc:mysql://localhost:3306/foodapp";//How did you get this
        String username = "root";
        String password ="";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL,username,password);
            String sql = "SELECT * FROM users";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            //System.out.println(result.getString(2));
            int count = 0;
            while (result.next())//next(): Check if the sql query has row or not.If it returns true,
        // it will point to first row and fetch the details of that row and then it will go the next row and do the same
            {
                //System.out.println(result.getString(2));
                String name = result.getString(2);
                String pass = result.getString(3);
                String fullname = result.getString("fullname");
                String email = result.getString("email");

                String format = "User #%d: %s - %s - %s - %s";
                String formattedOutput =String.format(format, ++count,name,pass,fullname,email);
                System.out.println(formattedOutput);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
