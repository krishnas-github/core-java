package com.mycompany.filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args){
        try{
            File myObj = new File("Demo.txt");//Creating a object of a file for reading the data
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("IOException has occurred");
            e.printStackTrace();
        }
    }
}
