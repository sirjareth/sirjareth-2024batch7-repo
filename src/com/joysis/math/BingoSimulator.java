/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.math;

import java.util.Random;


public class BingoSimulator {
    
    /*
        B I N G O
    B:  1 - 15
    I:  16 - 30
    N:  31 - 45
    G:  46 - 60
    O:  61 - 75
    */
    
    static String letter; // instance variable
    
    public static void main(String[] args) {
        Random random = new Random();
        
        
        int roll = random.nextInt(75) + 1;
        
        if (roll < 16) {
            letter = "B";
        } else if(roll < 31){
            letter = "I";
        } else if(roll < 46){
            letter = "N";
        } else if(roll < 61){
            letter = "G";
        } else {
            letter = "O";
        }
        
        System.out.println("Sa letra ng " + letter + " : " + roll);
    }
  
    
}
