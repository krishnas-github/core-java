package com.mycompany.assignmentday3;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of lines till which you need the pattern");
        int num = scan.nextInt();
        System.out.println("Entered number of lines is " +(num));
        for(int i=num; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
