package com.mycompany.abstractdemo;

public abstract class Employee {
    private final String companyName = "xyz pvt ltd";

    //This is a concrete method because it has its own method body and implementation.
    public String getCompanyName(){
        return this.companyName;
    }
    public abstract double calculateSalary(String employmentType);//This is an abstract method(no method body)

}
