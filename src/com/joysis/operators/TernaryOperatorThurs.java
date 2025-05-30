/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.operators;

/**
 *
 * @author user
 */
public class TernaryOperatorThurs {
    
    public static void main(String[] args) {
        
        // program that will check if the number is odd or even
        // Odd or Even
//        int number = 11;
//        boolean isEven = number % 2 == 0; 
        
        
        int number = 103;
        
        String isEven = number % 2 == 0 ? "Even" : "Odd";
       // System.out.println(isEven);
        
        int year = 2020;
        String isLeapYear = year % 4 == 0 ? "Leap Year" : "Not Leap Year";
        //System.out.println(isLeapYear);
        
        // 37.5 -> fever
        float temp = 37.5f;
        String hasFever = temp >= 37.5 ? "Fever" : "Normal Temp";
        System.out.println(hasFever);
        
        
    }
}
