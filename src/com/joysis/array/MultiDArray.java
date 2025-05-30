/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.array;

public class MultiDArray {

    public static void main(String[] args) {

        // syntax
        int[] numbers = {}; // single D
        int[][] ages = {{}, {}, {}}; // multi D

        
        
        String[][] planets = {
            //    0         1       2       3
            {"Mercury", "Venus", "Earth", "Mars"}, // 0
            {"Jupiter", "Saturn", "Uranus", "Neptune"}, // 1
            {"Pluto", "Namek"} // 2  
        };

        System.out.println("Traversing a multi dimensional array using nested for each loop");
        for(String[] rows : planets){
           for(String column : rows){
               System.out.println(column);
           }
           System.out.println("");
       }
       
       
       
       

    }

}
