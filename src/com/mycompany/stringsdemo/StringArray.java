package com.mycompany.stringsdemo;

import com.mycompany.bookauthorproject.Author;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = {1, 2, 3, 4, 5};
        System.out.println("Select from the below author id which you need to delete");
        for (int i =0;i<array.length;i++){
            System.out.println(i+1+ ": " +array[i]);
        }
        System.out.println("----------------------------------------");
        int id = sc.nextInt();
        sc.nextLine();
        int k =0;
        int temp[]=new int[array.length];
        for(int i=0;i<array.length;i++){
            temp[i] = array[i];
            //k=k+1;
            if(array[i] == id){
                System.out.println("Id found at index" +(i+1));
                if(i+1==array.length){//to check if its a last record
                    break;
                }
                temp[i] = array[i+1];
                i=i+1;
            }
        }

        //array.length = array.length -1;
       for(int i=0;i<temp.length-1;i++){
            System.out.println(i+1+ ": " +temp[i]);
            //System.out.println(i+1+ ": " +temp[i]);
        }
        for(int i=0;i<array.length-1;i++){
            array[i]=temp[i];
        }
    }
}
