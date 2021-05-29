package com.mycompany.bookauthordatabase;

import javax.xml.crypto.Data;
import java.sql.*;
import java.util.Scanner;

public class BookAuthorMenu extends DataBaseConnection{
    static Scanner scan = new Scanner(System.in);
    static int choice;
   // int rowsinserted =0;

    public static void menu(){
        System.out.println("0: Enter the number of books and author");
        System.out.println("1: Add authors");
        System.out.println("2: Add book");
        System.out.println("3: Search a book by book name");
        System.out.println("4: Display a book details");
        System.out.println("5: Display an author details");
        System.out.println("6: Display all books");
        System.out.println("7: Display all authors");
        System.out.println("8: Update the detail");
        System.out.println("9: delete a record");
        System.out.println("99: Exit program");
        System.out.println("Enter your choice");
        choice = scan.nextInt();
        scan.nextLine();

    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //DataBaseConnection db = new DataBaseConnection();
        int noOfBook =0;
        int noOfAuthor =0;
        int rowsinserted =0;

        while (true){
            menu();
            switch (choice){
                case 0:
                    System.out.println("Enter the number of books and author");
                    System.out.println("Enter the number of books for which you need to enter the detail");
                    noOfBook = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter the number of author for which you need to enter the detail");
                    noOfAuthor = scan.nextInt();
                    scan.nextLine();
                    break;
                case 1:
                    //Why we need to throws exception again?
                    for(int i=0;i<noOfAuthor;i++){
                        System.out.println("Enter the author detail of author no" +(i+1));
                        String sql ="INSERT INTO author (authorid,authorname) VALUES(?,?)";
                        //db.dbConnect();
                        try{
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection(dbURL,username,password);
                            PreparedStatement statement = conn.prepareStatement(sql);
                            System.out.println("Enter the authorid");
                            int aid = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Enter the author name");
                            String aname = scan.nextLine();
                            statement.setString(1, String.valueOf(aid));
                            statement.setString(2,aname);
                            rowsinserted = statement.executeUpdate();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        } catch (SQLException throwables) {
                            throwables.printStackTrace();
                        }

                    }
                    if (rowsinserted >0){
                        System.out.println(noOfAuthor +" new rows was inserted successfully!!!");
                    }
                    break;
                case 2:
                    System.out.println("Add book");
                    for(int i=0;i<noOfBook;i++){
                        System.out.println("Enter the detail of Book no "+(i+1));
                        String sql = "Insert INTO book (bookid,booktitle,bookdescription,bookprice,authorid) VALUES(?,?,?,?,?)";
                        try{
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection(dbURL,username,password);
                            PreparedStatement statement = conn.prepareStatement(sql);
                            System.out.println("Enter the bookid");
                            int bid = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Enter the book title");
                            String btitle = scan.nextLine();
                            System.out.println("Enetr the book description");
                            String bdesc= scan.nextLine();
                            System.out.println("Enter the book price");
                            Double bprice = scan.nextDouble();
                            scan.nextLine();
                            String sql1 ="SELECT count(*) from author";
                            //PreparedStatement statement1 = conn.prepareStatement(sql1);
                            Statement statement1 = conn.createStatement();
                            ResultSet result = statement.executeQuery(sql1);
                            int noOfAuth =0;
                            while (result.next()){
                                noOfAuth = result.getInt(1);
                            }
                            //System.out.println(result.getInt(1));
                           // System.out.println(noOfAuth);
                            System.out.println("Enter the author id from the below list");
                            String sql2 ="SELECT * from author";
                                //PreparedStatement statement2 = conn.prepareStatement(sql2);
                            Statement statement2 = conn.createStatement();
                            ResultSet result1 = statement2.executeQuery(sql2);
                            while (result1.next()){
                                int id = result1.getInt(1);
                                String name = result1.getString(2);
                                String format = "%d - %s";
                                String formatteOutput = String.format(format,id,name);
                                System.out.println(formatteOutput);
                            }
                            int baid = scan.nextInt();
                            scan.nextLine();
                            statement.setString(1, String.valueOf(bid));
                            statement.setString(2,btitle);
                            statement.setString(3,bdesc);
                            statement.setString(4, String.valueOf(bprice));
                            statement.setString(5, String.valueOf(baid));
                            rowsinserted = statement.executeUpdate();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        } catch (SQLException throwables) {
                            throwables.printStackTrace();
                        }
                    }
                    if (rowsinserted >0){
                        System.out.println(noOfBook +" new rows was inserted successfully!!!");
                    }
                    break;
                case 3:
                    System.out.println("Search a book by book name");
                    break;
                case 4:
                    System.out.println("Display a book details");
                    break;
                case 5:
                    System.out.println("Display an author details");
                    break;
                case 6:

                    break;
                case 7:
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(dbURL,username,password);
                    String sql2 ="SELECT * from author";
                    //PreparedStatement statement2 = conn.prepareStatement(sql2);
                    Statement statement2 = conn.createStatement();
                    ResultSet result1 = statement2.executeQuery(sql2);
                    while (result1.next()){
                        int id = result1.getInt(1);
                        String name = result1.getString(2);
                        String format = "%d - %s";
                        String formatteOutput = String.format(format,id,name);
                        System.out.println(formatteOutput);
                    }
                    break;
                case 8:
                    System.out.println("Update the detail");
                    break;
                case 9:
                    System.out.println("9: delete a record");
                    break;
                case 99:
                    System.out.println("Exit program");
                    System.exit(0);

            }

        }
    }
}
