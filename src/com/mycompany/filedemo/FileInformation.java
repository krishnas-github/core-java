package com.mycompany.filedemo;

import java.io.File;

public class FileInformation {
    public static void main(String[] args){
        //creating an object of a file
        File myObj = new File("Demo.txt");
        if(myObj.exists()){
            System.out.println("File Name "+ myObj.getName());//Getting file name
            System.out.println("File path " + myObj.getAbsolutePath()); //getting file path
            System.out.println("Writable " +myObj.canWrite());//Displaying whether the file is writable
            System.out.println("Readable " +myObj.canRead());//Displaying whether the file is readable
            System.out.println("File size is Byte "+myObj.length());//Returning the length of the file in Bytes(how to get lenghth in caharacter)
        }
        else {
            System.out.println("File does not exist");
        }

    }
}
