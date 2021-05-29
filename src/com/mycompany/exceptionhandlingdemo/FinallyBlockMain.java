package com.mycompany.exceptionhandlingdemo;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class FinallyBlockMain {
    public static void main(String[] args){
        String name = null;
        try{
            if(name != null) {
                name.length();
            }
            name = "xyz";
            int data =25/5;
            System.out.println(data);
        }
        catch (NullPointerException npe) {
            name = "abc";
            System.out.println(npe);
        }
        finally {
            System.out.println("Finally block is always executed does not matter whether exception occurred or not");
            System.out.println("Data closing or File operation closing or any cleaning activity can be done in finally block");
        }
        System.out.println("Rest of the code");
        try{

        }
        finally {
            System.out.println("try with finally exist");
        }
        try{
            System.exit(0);

        }
        finally {
            System.out.println("Finally block will not be executed because system.exit was called");
        }
    }
}
