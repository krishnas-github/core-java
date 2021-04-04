package com.mycompany.controlstatement;

public class IfElseIfMain {
    public static void main(String[] a){

        int marksObtained = 641;
        int totalMarks = 1000;

        /*if(marksObtained > 400){
            System.out.println("Just Passed");
        }else{
            System.out.println("You failed, work hard");
        }*/

        if(600 >= marksObtained && marksObtained > 400){
            System.out.println("You passed with Grade - C");
        }else if(800 >= marksObtained && marksObtained > 600){
            System.out.println("You passed with Grade - B");
        }else if(totalMarks >= marksObtained && marksObtained > 800){
            System.out.println("You passed with Grade - A");
        }else{
            System.out.println("You failed, work hard");
        }
    }
}
