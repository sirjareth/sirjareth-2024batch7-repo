/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.operators;


public class Relational_LogicalOperatorThursday {
    
    public static void main(String[] args) {
        byte num1 = 10;
        byte num2 = 20;
        
        //                  T       &&       F      =  T
        boolean isTrue = num1 < num2 & num2 < num1;
        System.out.println(isTrue);
        
        
        /*
            1st     2nd     Result
            T       T       T
            T       F       F
            F       T       F
            F       F       F
        */
        
        //System.out.println(num1 != num2);
    }
}
