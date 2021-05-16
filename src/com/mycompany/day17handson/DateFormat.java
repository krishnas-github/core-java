package com.mycompany.day17handson;

import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormat {

    //public static Object Date = "2020-09-10";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern in which you want the date");
        String str1 = sc.nextLine();
        SimpleDateFormat str= new SimpleDateFormat(str1);
        Date date = new Date();
        String dt = str.format(date);
        System.out.println(dt);
        //System.out.println(DateFormat.getInstance().format(date));
    }
}