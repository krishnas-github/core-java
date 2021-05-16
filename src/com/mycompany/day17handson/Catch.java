package com.mycompany.day17handson;

import java.util.Scanner;

public class Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        Try b = new Try();
        b.validate(a);

    }
}
