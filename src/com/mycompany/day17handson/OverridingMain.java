package com.mycompany.day17handson;

import java.util.Scanner;

public class OverridingMain {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        sc.nextLine();
        Overriding1 cal = new Overriding1();
        int math = cal.sum(a,b);
        System.out.println(math);
        Overriding1 cal1 = new Overriding2();
        math = cal1.sum(a,b);
        System.out.println(math);

    }

}
