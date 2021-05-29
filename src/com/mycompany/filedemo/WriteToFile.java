package com.mycompany.filedemo;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args){
        try {
            FileWriter myWriter = new FileWriter("Demo.txt");
            myWriter.write("Welcome to java. Java is a prominent language of the millennium!!!\n");
            myWriter.append("Thank You!!");
            //myWriter.write("Thank You");

            myWriter.close();
            System.out.println("Successfully wrote to a file");
        } catch (IOException e) {
            System.out.println("IOException error occurred");
            e.printStackTrace();
        }
    }
}
