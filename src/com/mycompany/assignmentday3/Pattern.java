package com.mycompany.assignmentday3;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows till which you want the patter");
        int num = scan.nextInt();
        System.out.println("The entered number is "+(num)+"");
        for(int i=0;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
