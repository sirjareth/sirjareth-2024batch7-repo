/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.strings;

import java.util.Scanner;

public class CastingMonday {

    public static void main(String[] args) {

        double d = 100;

        byte x = (byte)((short) d);
        System.out.println(x);
        
        /*
        a. 100
        b. exception 
        c. compilation fails
        */
    }

}

/*



//        System.out.println(isTrue);
//        String number = "100000000000";
//        long newNum = Long.valueOf(number);
//        System.out.println(newNum);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = 0;
        
        switch (num) {
            case 1:
                System.out.println("One");
        }

        // upcasting downcasting
        
        int num = 10;

        System.out.println((double)num);
    // Parsing - String -><- primitive DT
    // Casting - number class
 */
