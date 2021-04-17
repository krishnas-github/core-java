package com.mycompany.stringsdemo;

public class StringPractice {
    public static void main(String[] args){
        String string = "Hello World";//11
        //length
        int length = string.length();
        //int length =string.length;
        System.out.println("The length of string is " +(length));
//substring
        //String substring = string.substring(0,6);//(i,j-1)
        String substring = string.substring(string.length()-3, string.length());//(i,j-1)
        System.out.println("The length of string is " +(substring));
//index
        int index = string.indexOf("Wo");
        System.out.println("The index of string is " +(index));
        String substring1="ll";
//index using substring
        int index1 = string.indexOf(substring1);
        System.out.println("The index of string is " +(index1));
//last index
        String substring2="o";
        int index2 = string.lastIndexOf(substring2);
        System.out.println("The last index of string is " +(index2));
//compare to
        String substring3="abc";
        String substring4="abb";
        String substring5="abd";
        System.out.println(substring3.compareTo(substring4));
        int index3 = substring3.compareTo(substring4);
        System.out.println(index3);//doubt//why -3
//start with r end with
        //System.out.println(string);
        System.out.println(string.startsWith("H"));
///pattern search
        String line = "Krishna is a good boy";
        String pattern = "Krishna";
        if(line.matches(pattern)) {
            System.out.println(line + "matches \"" + pattern + "\"");
        }
        else {
            System.out.println("no match");
        }

        }

    }

