package com.mycompany.assignmwntday4;

public class Employee {
    long employeeId;
    double salary;

    void setEmployeeId(long empid){
        employeeId = empid;
    }

    void setSalary(double s){
        salary = s;
    }

    long getEmployeeId(){
        return employeeId;
    }

    double getSalary(){
        return salary;
    }
}
