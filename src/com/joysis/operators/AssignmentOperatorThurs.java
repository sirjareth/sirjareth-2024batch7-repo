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
public class AssignmentOperatorThurs {
    
    public static void main(String[] args) {
        int num = 10;
       
        num = num + 50;
        num += 50;
        System.out.println(num);
        
        
        num %= 50;
        System.out.println(num);
    }
    
}
