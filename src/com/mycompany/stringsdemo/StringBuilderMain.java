package com.mycompany.stringsdemo;

public class StringBuilderMain {
    public static void main(String[] args){
        //Whenever you want to do string manipulation go for StringBuilder for better performance
        StringBuilder sb = new StringBuilder("Krishna");
        String s1 = sb.toString();
        //System.out.println(sb);
        sb.append(" ");
        sb.append("Sahoo");
        sb.insert(0, "Mr ");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        System.out.println(sb.delete(0,3));
        System.out.println(sb.replace(0,0,"Mr "));




    }
}
