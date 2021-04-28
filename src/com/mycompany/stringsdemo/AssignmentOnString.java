package com.mycompany.stringsdemo;

import java.util.Scanner;

public class AssignmentOnString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int j = 1;
        System.out.println("Enter the string");
        String str = sc.nextLine();
        //"  Hello krishna ,  how    are you   ?  ";
        System.out.println("String before input");
        System.out.println(str);
        //System.out.println(str.replaceAll("\\s+"," ").trim());
        String str1 = str.replaceAll("\\s+"," ").trim();
        System.out.println("String after converting every string into upper case is:");
        System.out.println(str1.toUpperCase());
        for(int i=0;i<str1.length();i++){
            if(Character.isWhitespace(str1.charAt(i))){
                j++;
            }
        }
        //System.out.println(str1);
        System.out.println("There are "+j+" number of words in your string");



    }
}
