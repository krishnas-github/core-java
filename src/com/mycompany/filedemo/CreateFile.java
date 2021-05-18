package com.mycompany.filedemo;

import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String[] args){
        try {
            //Creating a new file
            File myObj =new File("Demo1.txt");
            if(myObj.createNewFile()){
                System.out.println("File Created " +myObj.getName());
                System.out.println("File path " +myObj.getAbsolutePath());
                System.out.println(myObj.getCanonicalFile());
                System.out.println(myObj.getPath());
            }
            else{
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            System.out.println("IOException error occurred");
            e.printStackTrace();
        }
    }
}
