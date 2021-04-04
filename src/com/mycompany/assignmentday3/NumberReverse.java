package com.mycompany.assignmentday3;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        System.out.println("Thank you for entering the number");
        System.out.println("Entered number is "+(num)+"");
        int rev=0;
        int rem;
        while(num!=0){
            rem = num%10;
            rev = (rev*10) + rem;
            num = num/10;
        }
        System.out.println("The reversed number is "+(rev)+"");
        System.out.println("Chal Bye");
    }

}
