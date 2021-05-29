package com.mycompany.serializationdemo.multipleserialization;

import java.io.*;
import java.util.ArrayList;

public class Deserialize {
    public static void main(String[] args){
        Employee emp = null;
        String file = "emp.txt";
        try{
            FileInputStream file1 = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(file1);
            //System.out.println(in.readObject().getClass());
            ArrayList<Employee> empArr = (ArrayList<Employee>) in.readObject();
            System.out.println(empArr.getClass());
            System.out.println("Object has been deserialized");
           /* for(Object a: empArr ){
                //emp = (Employee) a;
                //System.out.println(emp.getEmp_name());
            }*/
            for(int i=0;i<empArr.size();i++){
                emp = empArr.get(i);
                System.out.println(emp.getEmp_name()+ " "+ emp.getEmp_age()+ " "+emp.getEmp_sal());
            }
            in.close();
            file1.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }


        }
    }

