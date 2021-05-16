package com.mycompany.day17handson;

import java.util.Scanner;

public class RemovingOccurrences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string in which you need to remove the occurrences");
        String str = sc.nextLine();
        System.out.println("Enter the character with which you want to replace");
        String ch = sc.nextLine();
        String str1 = str.replaceAll(ch,"");
        System.out.println("THe input string after removing the character is: "+str1);
    }
}
