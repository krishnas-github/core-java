package com.mycompany.exceptionhandlingthrow;

import java.util.Scanner;

public class Age {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age to check for marriage and vote");
        int age = sc.nextInt();
        sc.nextLine();
        //BusinessLayer bl = new BusinessLayer();
        UILayer bl = new UILayer();
        try{
           String str1 = bl.ageCheck1(age);
            System.out.println(str1);
        }
        /*catch (BusinessException m){
            System.out.println("Error_code"+ m.getErrorCode());
            System.out.println("Error_Message"+ m.getErrorMessage());
        }*/
        catch (Exception e) {
            e.printStackTrace();
        }

        try{
            String str2 = bl.mAgeCheck1(age);
            System.out.println(str2);
        }
       /* catch (BusinessException m){
            System.out.println("Error_code"+ m.getErrorCode());
            System.out.println("Error_Message"+ m.getErrorMessage());
        }*/
        catch (Exception e) {
            e.printStackTrace();
        }

    }


}
