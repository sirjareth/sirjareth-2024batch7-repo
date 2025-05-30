/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.scanner;

import java.util.Scanner;


public class Activity5_Ronquillo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number that you want to view: ");
        int tableNumber = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + tableNumber + " = " + (i * tableNumber));
        }
        
        
        
    }
}
