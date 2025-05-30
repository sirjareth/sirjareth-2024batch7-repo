/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.array;

import java.util.Scanner;


public class SingleDArray {
    
    /*
    age1: 16
    age2: 12
    age3: 11
    age4: 22
    age5: 31
    */
    public static void main(String[] args) {
        //            0    1   2   3   4
        //int[] ages = {15, 12, 11, 22, 31};
        
        
        // User Input 
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[5];
        // 1 2 3 4 5
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        
        
        System.out.println("Traversing a single dimensional array using for loop"); 
        System.out.println("Age1\tAge2\tAge3\tAge4\tAge5"); // header
        for (int i = 0; i < ages.length; i++) {
            
            System.out.print(ages[i] + "\t");
            
            
        }
        System.out.println("");
        //System.out.println("Traversing a single dimensional array using for each loop"); 
        
//        for (int age : ages){
//            System.out.print(age + " , ");
//        }
//        System.out.println("");
        
        sc.close(); // close the scanner
        
        
        
        /*
            For Loop
            Enhance For Loop (For Each Loop)
        */
        
        
        
        /*
            1 Compilation Error
            2 Exception
        */
        
        
        
    }

}
