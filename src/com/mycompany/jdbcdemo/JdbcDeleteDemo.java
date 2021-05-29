package com.mycompany.jdbcdemo;

import java.sql.*;
import java.sql.Connection;

public class JdbcDeleteDemo {
    public static void main(String[] args){
        String dbURL = "jdbc:mysql://localhost:3306/foodapp";
        String username = "root";
        String password = "";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL,username,password);
            String sql = "DELETE FROM users where username =?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,"john");

            int rowsDeleted = statement.executeUpdate();
            if(rowsDeleted >0){
                System.out.println("An user was deleted successfully");
            }
            else{
                System.out.println("No Such user found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
