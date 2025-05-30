/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.looping;


public class ForLoopTuesday {
    
    
    // For Loop -> incredibly useful for tasks that require repetition
    
    // Write your name 5 times.
    // Print numbers from 5 - 15
    
    public static void main(String[] args) {
       
        /*
            initialization; condition; increment/decrement
            // statement / body of the loop / block of code
        */
               
        //  
        
        /*
            Exercise 2: Print the first five 
                    positive even numbers.
                    2 , 4 , 6 , 8 , 10
        */
        
        
        
        for(int i = 2; i <= 10; i+=2){
            System.out.println(i);
        }
        
        for (int i = 2; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
        
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * 2);
        }
        
        for (int i = 3; i <= 10; i++) {
            System.out.println(i++);
        }
        
        
        
       
        
        
    }
}
