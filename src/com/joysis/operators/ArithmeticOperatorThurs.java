/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.operators;

public class ArithmeticOperatorThurs {
    
    public static void main(String[] args) {
        short num = 1005;
        short num2 = 10;

        int remainder = 1005 % 10;
        
        //System.out.println(num / num2 + " remainder: " + remainder);
        
        // program that will check if the number is odd or even
        // true -> number:even / false -> number:odd
        int number = 11;
        boolean isEven = number % 2 == 0; 
        //System.out.println(isEven);
        
        // program that will check if a year is a leap year
        int year = 2020;
        boolean isLeapYear = year % 4 == 0;
        System.out.println(isLeapYear);
    }
}
