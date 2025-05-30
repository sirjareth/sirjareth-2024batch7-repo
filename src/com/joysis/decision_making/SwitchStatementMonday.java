/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.decision_making;

import java.util.Scanner;


public class SwitchStatementMonday {

    private final Scanner scanner;
    
    public SwitchStatementMonday(Scanner scanner) {
        this.scanner = scanner;
    }
    
    
    
    
    public static void main(String[] args) {
        
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month: ");

        String month = scanner.nextLine();
        
        // syntax 
        switch(month){
            case "January":
                System.out.println("Hot Dry Season");
                break;
            case "February":
                System.out.println("Cold Season");
                break;
            case "March":
                System.out.println("Winter Season");
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
        
        /*
        Pwede: byte short int String chart enum
        Bawal: float, double, long, boolean
        */
        
    }
}
