package com.mycompany.day17handson;

public class NullPointer {
    public static void main(String[] args){
        int a=5;
        String str[] = null;
        for(int i=0;i<a;i++){
            str[i] = str[i]+1;
        }
        System.out.println(str);
    }
}
