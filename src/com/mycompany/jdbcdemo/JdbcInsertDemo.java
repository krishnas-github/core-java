package com.mycompany.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertDemo {
    public static void main(String[] args){
        String dbURL= "jdbc:mysql://localhost:3306/foodapp";
        String username = "root";
        String password = "";
//Driver:Driver is a set of classes through which we interact with different types of databases.
        try{
            Class.forName("com.mysql.jdbc.Driver");//Creates a Driver object for interacting with mysql database,
            // Different databases has different drivers. Ex:Oracle will have different driver
            Connection conn = DriverManager.getConnection(dbURL,username,password);//Creates a connection to my sql
            //database server by taking dbURL,username and password
            String sql = "INSERT INTO users (username, password, fullname, email) VALUES (?,?,?,?)";//What if we keep this value as empty?
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,"john");
            statement.setString(2,"secretpass");
            statement.setString(3,"John Doe");
            statement.setString(4,"john.doe@gmail.com");
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted >0){
                System.out.println("A new rows was inserted successfully!!!");
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
