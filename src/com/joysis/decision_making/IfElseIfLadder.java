/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.decision_making;

import java.util.Scanner;



public class IfElseIfLadder {
    
    public static void main(String[] args) {
        /*
            January -> Hot Dry Season
            April -> Cold Season
            December -> Winter Season
        */
        // User Input -> Scanner
        // Class is a blueprint of an object
        // Class Instantation -> object
        // Classname object = new Classname();
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month: ");

        String month = scanner.nextLine();
        
        if(month.equals("January")){
            System.out.println("Hot Dry Season");
        } else if(month == "February"){
            System.out.println("Cold Season");
        } else if(month == "March"){
            System.out.println("Winter Season");
        } else {
            System.out.println("Invalid Input!");
        }
        
        /*
            Load Registration System
        
            1. Text Only
            2. Call Only
            3. Call N Text
            4. Data Only
        */
        
        
        // == vs. equals()
        
//        String month2 = "January"; // string literal
//        String month3 = new String("January"); // string object
//        System.out.println(month2 == month3);
        
        
    }
}


/*
    
            1 -> January
            2 -> February
            3 -> March
        
        
        int month = 2;
        
        if(month == 1){
            System.out.println("January");
        } else if(month == 2){
            System.out.println("February");
        } else if(month == 3){
            System.out.println("March");
        } else if(month == 4){
            System.out.println("April");
        } 
        
*/