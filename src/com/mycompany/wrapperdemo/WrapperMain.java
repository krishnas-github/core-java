package com.mycompany.wrapperdemo;

public class WrapperMain {
    public static void  main(String[] args){
        Integer num1 =10;
        Integer num2 = new Integer(12345);

        Double Salary = 2345.2345;
        Float a = 2345.3f;//F or f both are allowed
        Long ln = 2345678L;//L or l both are allowed
        Character c = 'A';
        //Boolean b = new Boolean(Boolean.TRUE);//What is the difference between this and below line?
        Boolean b = new Boolean(true);
        String roll = "1234";
        Integer r = Integer.parseInt(roll);
        Double d = Double.parseDouble(roll);
        System.out.println(r);
        System.out.println(d);
        //Find some utility function from google and try in this demo

    }
}
