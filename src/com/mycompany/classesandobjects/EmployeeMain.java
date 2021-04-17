package com.mycompany.classesandobjects;

public class EmployeeMain {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setEmployeeId(12345);
        e1.setSalary(23000);

        Employee e2 = new Employee();
        e2.setEmployeeId(12346);
        e2.setSalary(24000);

        System.out.println("The employee id for 1st employee is" + e1.getEmployeeId());
        System.out.println("The salary for ist employee is" + e1.getSalary());

        System.out.println("The employee id for 2nd employee is" + e2.getEmployeeId());
        System.out.println("The salary for ist employee is" + e2.getSalary());
    }
}
