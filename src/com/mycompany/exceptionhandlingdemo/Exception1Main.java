package com.mycompany.exceptionhandlingdemo;

public class Exception1Main {
    public static void main(String[] args){
        /*int a =5;
        int b =0;
        int c = a/b;
        System.out.println(c);*/
        calculate(5,2);
        calculate(5,0);
    }
    public static void calculate(int a , int b){
        try {
           // if (a > b) {Will this be catched by same catch statement below? If i want a seperate catch (for exception handeliing by Exception class then how to do it
                int c = a / b;
                System.out.println(c);
            }
       // }
        catch (Exception e){
            System.out.println("Divisible by zeo not allowed");
        }
        System.out.println("Exiting calculate function");
        /*int c =a/b;
        System.out.println(c);*/
    }
}
