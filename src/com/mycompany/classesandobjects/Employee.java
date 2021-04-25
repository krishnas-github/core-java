package com.mycompany.classesandobjects;

public class Employee {
    long employeeId;
    double salary;

    void setEmployeeId(long empid){
        long employeeId = 10L;
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