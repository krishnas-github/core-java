package com.mycompany.serializationdemo.multipleserialization;

import java.io.Serializable;

public class Employee implements Serializable{
    private String emp_name;
    private int emp_age;
    private double emp_sal;

    //Employee(){}

    Employee(String emp_name, int emp_age, double emp_sal){
        this.emp_name = emp_name;
        this.emp_age = emp_age;
        this.emp_sal = emp_sal;
    }

    public String getEmp_name(){
        return emp_name;
    }

    public int getEmp_age(){
        return  emp_age;
    }
    public double getEmp_sal(){
        return emp_sal;
    }
}
