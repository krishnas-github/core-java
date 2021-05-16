package com.mycompany.day17handson;

public class Try extends Exception{
    int number;
    public void validate(int number){
        try{
            if(number<10){
                System.out.println("Small number");
            }
            else{
                System.out.println("Number is greater than 10");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
