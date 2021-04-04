package com.mycompany.controlstatement;

public class IfElseDemo {
    public static void main(String args[]){

        boolean isSunRise = true;
        boolean isRaining = false;

        if (isSunRise && !isRaining) {
            System.out.println("go to office if sunrise");
        }
        else  {
            System.out.println("dont go to office");

        }

        int count = 5;
        for (int i=0; i<count; i++){
            if (i==2) {

            break;
            }
            System.out.println(i+1);
        }
    }

}
