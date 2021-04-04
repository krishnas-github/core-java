package com.mycompany.assignmentday3;

import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scan.nextByte();
        System.out.println("Enter the second number");
        int num2 = scan.nextByte();
        System.out.println("The entered numbers (before swapping) are "+(num1)+" and "+(num2)+"");
        int tmp = 0;
        tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("The numbers after swapping are "+(num1)+" and "+(num2)+"");

    }
}
