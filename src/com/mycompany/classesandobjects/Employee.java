package com.mycompany.classesandobjects;

public class Employee {
    long employeeId;
    double salary;

    void setEmployeeId(long empid){
        employeeId = empid;
    }

    void setSalary(double sal){
        salary = sal;
    }

    long getEmployeeId(){
        return employeeId;
    }
    double getSalary(){
        return salary;
    }
}