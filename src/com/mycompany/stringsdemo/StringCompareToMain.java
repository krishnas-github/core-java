package com.mycompany.stringsdemo;


import java.util.Scanner;

public class StringCompareToMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=0;

       /*String s1 = "apple";
        String s2 = "banana";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));*/
        System.out.println("Enter a integer value");
        a = sc.nextInt();
        //sc.next();
        System.out.println(a);
        System.out.println("Enter a string value");
        String b = sc.next();
        System.out.println(b);
    }
}
