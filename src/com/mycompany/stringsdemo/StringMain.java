package com.mycompany.stringsdemo;

public class StringMain {
    public static void main (String[] args){
        String s1 = "Krishna";
        String s2 = "Krishna";
        String s3 = new String("Krishna");
        String s4 = new String("Krishna");
//checking refernces using == operator whether these references pointing to same object or not
        if (s1==s2){
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("s1 and s2 are not equal");
        }
        if (s1==s3){
            System.out.println("s1 and s3 are equal");
        }
        else{
            System.out.println("s1 and s3 are not equal");
        }

        if (s1.equals(s2)){
            System.out.println("s1 and s2 are equal using equals method");
        }
        else{
            System.out.println("s1 and s2 are not equal using equals method");
        }
        if (s1.equals(s3)){
            System.out.println("s1 and s3 are equal using equals method");
        }
        else{
            System.out.println("s1 and s3 are not equal using equals method");
        }
        if (s3.equals(s4)){
            System.out.println("s3 and s4 are equal using equals method");
        }
        else{
            System.out.println("s3 and s4 are not equal using equals method");
        }
        if (s3==s4){
            System.out.println("s3 and s4 are equal using equals method");
        }
        else{
            System.out.println("s3 and s4 are not equal using equals method");
        }

    }
}
