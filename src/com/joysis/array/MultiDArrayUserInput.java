/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.array;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MultiDArrayUserInput {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] planets = new String[3][3];
        for (int i = 0; i < planets.length; i++) {
            for (int j = 0; j < planets[i].length; j++) {
                System.out.print("Enter planet for [" + i + "]" + "[" + j + "]: ");
                planets[i][j] = sc.nextLine();
            }
            System.out.println("");
        }
        
        System.out.println("Traversing a multi dimensional array using nested for loop");
        for (int i = 0; i < planets.length; i++) {
            for (int j = 0; j < planets[i].length; j++) {
                System.out.println(planets[i][j]);
            }
            System.out.println("");
        }
        
        
    }
}
