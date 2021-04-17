package com.mycompany.assignmwntday4;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Employee e1 = new Employee();
        System.out.println("Enter the number of employee for which you want to enter the detail");
        int numberofEmployee = scan.nextInt();
        Employee arrayofEmployee[] = new Employee[numberofEmployee];

        for(int i = 0; i<arrayofEmployee.length;i++){
            arrayofEmployee[i] = new Employee();//creates an employee object and assign the object reference
            System.out.println("Enter the employee id of "+(i+1)+" employee");
            arrayofEmployee[i].setEmployeeId(scan.nextInt());
            System.out.println("Enter the salary of "+(i+1)+" employee");
            arrayofEmployee[i].setSalary(scan.nextDouble());
        }
        for (int i=0;i<arrayofEmployee.length;i++){
            System.out.println("Employee id of emp "+(i+1)+" is "+arrayofEmployee[i].getEmployeeId());
            System.out.println("Salary of emp "+(i+1)+" is "+arrayofEmployee[i].getSalary());

        }

    }
}
