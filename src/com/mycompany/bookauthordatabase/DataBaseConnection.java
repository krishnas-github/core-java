package com.mycompany.bookauthordatabase;


import java.sql.*;
import java.sql.Connection;

public class DataBaseConnection {

    static String dbURL = "jdbc:mysql://localhost:3306/bookauthor";
    static String username = "root";
    static String password = "";

    public static Connection dbConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbURL, username, password);
        return conn;
    }
}

