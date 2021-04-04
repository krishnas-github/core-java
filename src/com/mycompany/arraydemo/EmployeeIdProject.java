package com.mycompany.arraydemo;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class EmployeeIdProject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Enter Your Age");
        int age = scanner.nextInt();
        System.out.println(age);*/
        System.out.println("Enter the number of employee in your company");
        int numberOfEmployee = scanner.nextInt();
        int arrayOfEmployee[] = new int[numberOfEmployee];

        for(int i=0;i<arrayOfEmployee.length;i++){
            System.out.println("Enter the employee id of "+(i+1)+" employee");
            arrayOfEmployee[i] = scanner.nextInt();

        }

        for(int i=0;i<arrayOfEmployee.length;i++){
            System.out.println("employee id of "+(i+1)+" employee is "+arrayOfEmployee[i]+" ");
        }

    }
}
