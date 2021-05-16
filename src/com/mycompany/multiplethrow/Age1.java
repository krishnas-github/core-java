package com.mycompany.multiplethrow;


import java.util.Scanner;

public class Age1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age to check for marriage and vote");
        int age = sc.nextInt();
        sc.nextLine();
        //BusinessLayer1 bl = new BusinessLayer1();
       /* ULayer bl = new ULayer();
        try{
            String str1 = bl.checkA(age);
            System.out.println(str1);
        }
        catch (BusinessException1 m){
           System.out.println("Error_Message"+ m.getErrorMessage());
       }

        /*try{
            String str2 = bl.mCheck(age);
            System.out.println(str2);
        }
        catch (BusinessException1 m){
            System.out.println("Error_Message"+ m.getErrorMessage());
        }*/

    }


}


