package com.mycompany.assignmentday3;

import java.util.Scanner;

public class NumberSwap2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scan.nextInt();
        System.out.println("Enter the Second number");
        int num2 = scan.nextInt();
        System.out.println("The number entered are " +(num1)+ " and " +(num2));
        num1=num1*num2;
        num2=num1/num2;
        num1=num1/num2;
        System.out.println("The number after swapping are " +(num1)+ " and " +(num2));

    }
}
