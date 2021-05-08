package com.mycompany.abstractdemo;

public class AbstractMain {
    public static void main(String[] args)
    {
        //Employee ee = new Employee();//object instantiation/creation is now allowed for abstract class
        //PermanentEmployee permanentEmployee = new PermanentEmployee();
        Employee permanentEmployee = new PermanentEmployee();//Reference of abstract class is allowed.
        // But object creation is not allowed as in line number 6
        ContractEmployee contractEmployee = new ContractEmployee();
        String companyName = permanentEmployee.getCompanyName();
        double salary = permanentEmployee.calculateSalary("Permanent");
        double salaryOfContractEmployee = contractEmployee.calculateSalary("Contract");
        System.out.println("Company Name is: " +companyName);
        System.out.println("Salary of permanent employee is: " +salary);
        System.out.println("Salary of contract employee is: " +salaryOfContractEmployee);
    }
}
